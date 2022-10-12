package scoket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Server {
    private ServerSocket serverSocket;
    private List<PrintWriter> socketList = new ArrayList<>();

    public Server() {
        try {
            System.out.println("正在启动服务端");
            serverSocket = new ServerSocket(8088);
            System.out.println("服务端启动完毕!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        try {
            while (true) {
                System.out.println("等待客户端连接。。。");
                Socket socket = serverSocket.accept();
                System.out.println(socket.getInetAddress() + "连接了。。。");
                ClientHandler handler = new ClientHandler(socket);
                Thread t = new Thread(handler);
                t.start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    private class ClientHandler implements Runnable {
        private Socket socket;
        private String host;

        public ClientHandler(Socket socket) {
            this.socket = socket;
            host = socket.getInetAddress().toString();
        }

        @Override
        public void run() {
            PrintWriter pw = null;
            try {
                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);

                OutputStream os = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(os, StandardCharsets.UTF_8);
                BufferedWriter bw = new BufferedWriter(osw);
                pw = new PrintWriter(bw, true);
                synchronized (socketList) {
                    socketList.add(pw);
                }
                sendMessage(host + "上线了，当前人数：" + socketList.size());
                String line;
                while ((line = br.readLine()) != null) {
                    if ("exit".equals(line)) {
                        System.out.println("客户端不说了");
                        break;
                    }
                    System.out.println("Ip地址：" + socket.getInetAddress() + ",说：" + line);
                    sendMessage("Ip地址：" + socket.getInetAddress() + ",说：" + line);

                }
            } catch (IOException e) {
            } finally {
                synchronized (socketList) {
                    socketList.remove(pw);
                    sendMessage(host + "下线了，当前在线人数：" + socketList.size());
                }
                try {
                    synchronized (socketList) {
                        socket.close();
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        private void sendMessage(String message) {
            synchronized (socketList) {
                for (PrintWriter p : socketList) {
                    p.println(message);
                }
            }
        }
    }

}
