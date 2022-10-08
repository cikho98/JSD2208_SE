package io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("pw.txt",true);
        OutputStreamWriter ows = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        BufferedWriter bw = new BufferedWriter(ows);
        PrintWriter pw = new PrintWriter(bw);
        pw.println("你好");
        pw.println("试试");
        pw.close();
    }
}
