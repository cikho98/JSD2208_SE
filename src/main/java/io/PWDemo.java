package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PWDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("pw.txt");
        pw.println("我是刘德华");
        pw.println("我是古巨基");
        System.out.println("写入完毕");
        pw.close();
    }
}
