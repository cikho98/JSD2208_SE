package file;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            File file = new File("./test"+i+".txt");
            if (file.exists()){
                file.delete();
                System.out.println("文件已删除");
            }else{
                System.out.println("文件不存在");
            }

        }
    }
}
