package file;

import java.io.File;
import java.io.FileFilter;

public class ListFileDemo2 {
    public static void main(String[] args) {
        File dir = new File(".");
        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File file) {
                String name = file.getName();
                return name.startsWith(".");
            }
        };


        File[] sub = dir.listFiles(filter);
        System.out.println("当前目录下共有"+sub.length+"个子项");

        sub = dir.listFiles((file)->file.getName().startsWith("."));
        System.out.println(sub.length);

    }
}
