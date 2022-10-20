package reflect;

import java.lang.reflect.Method;

public class ReflectDemo6 {
    public static void main(String[] args) throws Exception {
        Class cls = Class.forName("reflect.Person");
        Object o = cls.newInstance();
        Method m = cls .getDeclaredMethod("hehe");
        m.setAccessible(true);
        m.invoke(o);
        m.setAccessible(false);
    }
}
