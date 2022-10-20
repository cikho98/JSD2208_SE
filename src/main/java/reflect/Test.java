package reflect;

import java.io.File;
import java.net.URISyntaxException;

public class Test {
    public static void main(String[] args) throws URISyntaxException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        File dir = new File(Test.class.getResource(".").toURI());
        String packageName = dir.getName();
        File[] subs = dir.listFiles(f->f.getName().endsWith(".class"));
        for (File sub : subs){
            if (sub.isFile()){
                String fileName = sub.getName();
                fileName = fileName.substring(0,fileName.indexOf("."));
                System.out.println(fileName);
                Class cls = Class.forName(packageName+"."+fileName);
                Object obj = cls.newInstance();
                System.out.println(obj);
            }

        }

    }
}
