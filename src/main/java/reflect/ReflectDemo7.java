package reflect;

import java.lang.reflect.Constructor;

public class ReflectDemo7 {
    public static void main(String[] args) throws Exception {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1);
        System.out.println(s2);


        Class cls = Class.forName("reflect.Singleton");
        Constructor con = cls.getDeclaredConstructor();
        con.setAccessible(true);
        Object o = con.newInstance();
        Object o1 = con.newInstance();
        Object o2 = con.newInstance();
        con.setAccessible(false);
        System.out.println(o);
        System.out.println(o1);
        System.out.println(o2);

    }
}
