package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Downloads.zip");
        FileOutputStream fos = new FileOutputStream("Downloads_cp.zip");
        byte[] data = new byte[1024*10];


        long start = System.currentTimeMillis();
        while(( fis.read(data))!=-1){
            fos.write(data);
        }
        fis.close();
        fos.close();
        long end = System.currentTimeMillis();
        System.out.println("复制完毕共耗时："+(end-start)+"ms");
    }
}
