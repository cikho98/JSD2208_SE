package reflect;

import java.lang.reflect.Method;

public class ReflectDemo5  {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        p.say("qimoji");

        Class cls = Class.forName("reflect.Person");
        Object obj =cls.newInstance();
        Method m = cls.getMethod("say",String.class);
        m.invoke(obj,"diaonilaomu");

        Method m2 = cls.getMethod("say",String.class,int.class);
        m2.invoke(obj,"yamadie",6);

    }
}
