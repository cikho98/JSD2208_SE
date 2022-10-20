package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入类名");
        String className  = scan.nextLine();
        System.out.println("请输入方法名：");
        String methodName = scan.nextLine();
        Class cls = Class.forName(className);
        Object obj = cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(obj);
    }
}
