package reflect;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test3 {
    public static void main(String[] args) throws Exception {
        File dir = new File(Test3.class.getResource(".").toURI());
        String packageName = dir.getName();
        File[] subs = dir.listFiles(f -> f.getName().endsWith(".class"));
        for (File file : subs) {
            String fileName = file.getName();
            fileName = fileName.substring(0, fileName.indexOf("."));
            Class cls = Class.forName(packageName + "." + fileName);
            Constructor c = cls.getDeclaredConstructor();
            if (c.getModifiers() != Modifier.PUBLIC) {
                continue;
            }
            System.out.println("正在调用：" + c.getName() + "类");
            Object o = c.newInstance();
            Method[] methods = cls.getMethods();
            for (Method method : methods) {
                String methodName = method.getName();
                if (method.getParameterCount() == 0 &&
                        method.getModifiers() == Modifier.PUBLIC &&
                        methodName.toLowerCase().contains("s")) {
                    System.out.println("正在调用方法" + methodName);
                    method.invoke(o);
                }
            }
            System.out.println("-----------------");
        }
    }
}
