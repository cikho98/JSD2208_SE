package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Person p =new Person("李四",22);
        System.out.println(p);

        Class cls = Class.forName("reflect.Person");
        Constructor constructor = cls.getConstructor(String.class,int.class);
        Object obj = constructor.newInstance("王德发",22);
        System.out.println(obj);

    }
}
