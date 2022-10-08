package file;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("./demo.txt");
        String name = file.getName();
        System.out.println("文件名称是： "+name);

        long length = file.length();
        System.out.println("长度： "+length+"字节");

        boolean cr = file.canRead();
        System.out.println("可读:"+cr);
        boolean cw = file.canWrite();
        System.out.println("可写:"+cr);

        boolean ih = file.isHidden();
        System.out.println("是否隐藏："+ih);

    }
}
