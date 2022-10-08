package file;

import java.io.File;

public class DeleteDIrDemo {
    public static void main(String[] args) {
        File dir = new File("demo");
        if(dir.exists()){
            dir.delete();
            System.out.println("文件已删除");
        }else{
            System.out.println("该目录不存在");
        }
    }
}
