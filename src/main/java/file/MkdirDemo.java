package file;

import java.io.File;
import java.io.IOException;

public class MkdirDemo {
    public static void main(String[] args) throws IOException {
        File dir = new File("./demo");
        if (dir.exists()){
            System.out.println("目录已存在");
        }else{
            dir.mkdir();
        }

        File dir2 = new File("./a/b/c/d/e/f");
        if (dir2.exists()){
            System.out.println("目录已存在");
        }else{
            dir2.mkdirs();
            System.out.println("目录已创建");
        }


    }
}
