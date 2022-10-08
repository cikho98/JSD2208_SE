package io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ScannerText {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream("node2.txt",true);
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(bw,true);
        String str ;
        while (true){
            System.out.println("请输入需要写入的内容:");
             str = scan.nextLine();
            if ("exit".equals(str)){
                System.out.println("程序结束");
                break;
            };
            pw.println(str);
        }
        pw.close();
    }
}
