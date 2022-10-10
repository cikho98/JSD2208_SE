package scoket;

import javax.security.sasl.SaslClient;
import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    private Socket socket;

    public Client() {
        try {
            System.out.println("正在连接服务端");
            socket = new Socket("176.114.2.125", 8088);
            System.out.println("与服务端建立连接！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        try (OutputStream os = socket.getOutputStream();
             OutputStreamWriter osw = new OutputStreamWriter(os, StandardCharsets.UTF_8);
             BufferedWriter bw = new BufferedWriter(osw);
             PrintWriter pw = new PrintWriter(bw, true);
        ) {
            Scanner scan = new Scanner(System.in);
            while (true) {
                System.out.println("客户端说：");
                String line = scan.nextLine();
                if ("exit".equals(line)) {
                    System.out.println("不输入东西");
                    break;
                }
                pw.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}
