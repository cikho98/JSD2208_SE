package file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入文件名：\n");
        String file_name = scan.nextLine();
        File file = new File("./"+file_name);
        while (file.exists()){
            System.out.println("文件已存在");
            System.out.println("请输入文件名：\n");
            file_name = scan.nextLine();
            file = new File("./"+file_name);
        }
        if (file_name.contains(".") && !(file_name.startsWith("."))){
            file.mkdirs();
            System.out.println("文件夹创建成功");
        } else{
            file.createNewFile();
            System.out.println("文件创建成功");
        }

    }
}
