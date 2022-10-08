package file;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 10; i++) {
            File file = new File("./test"+i+".txt");
            if (file.exists()){
                System.out.println("文件已存在");
            }else{
                file.createNewFile();
            }
        }
    }
}
