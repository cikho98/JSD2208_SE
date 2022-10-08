package file;

import java.io.File;
import java.io.IOException;

public class CreateNewFileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("demo2.txt");
        if (file.exists()){
            System.out.println("文件已存在");
        }else{
            file.createNewFile();
            System.out.println("文件已创建");
        }
    }
}
