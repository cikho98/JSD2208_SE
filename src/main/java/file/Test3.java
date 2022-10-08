package file;

import java.io.File;
import java.io.FileFilter;

public class Test3 {
    public static void main(String[] args) {
        File dir = new File(".");
        File[] subs = dir.listFiles((file)->file.getName().contains("a"));
        System.out.println(subs.length);
        for (File sub:subs){
            sub.getName();
            System.out.println(sub);
        }
    }

}
