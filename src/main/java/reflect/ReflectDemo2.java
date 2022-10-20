package reflect;

import java.util.Scanner;

public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Person p = new Person();
        System.out.println(p);

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个类名");
        String className = scan.nextLine();
        Class cls = Class.forName(className);
        Object obj = cls.newInstance();
        System.out.println(obj);

    }
}
