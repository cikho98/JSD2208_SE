package chatroom;

import io.ScannerText;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    private Socket socket;
    public Client(){
        try {
            System.out.println("正在连接服务器中、、、");
            socket = new Socket("localhost",8088);
            System.out.println("连接服务器成功、、、");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start(){
        try {
            OutputStream os = socket.getOutputStream();
            Scanner scan = new Scanner(System.in);
            OutputStreamWriter osw = new OutputStreamWriter(os, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true);
            while (true){
                System.out.println("请输入你说的话:\n");
                String line = scan.nextLine();
                if ("exit".equals(line)){
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
