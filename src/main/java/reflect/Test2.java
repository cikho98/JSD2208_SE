package reflect;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) throws Exception {
        File dir = new File(Test2.class.getResource(".").toURI());
        String packeageName = dir.getName();
        String classNmae = "Person";
        Class cls = Class.forName(packeageName + "." + classNmae);
        Constructor con = cls.getDeclaredConstructor();
        Object o = con.newInstance();
        Method[] methods = cls.getDeclaredMethods();
        System.out.println(Arrays.toString(methods));
        for (Method method : methods) {
            int methodCount = method.getParameterCount();
            if (methodCount == 0 &&
                    method.getModifiers() == Modifier.PUBLIC
            &&
            method.getName().toLowerCase().contains("o")) {
                method.invoke(o);
            } else {
                Parameter[] parameters = method.getParameters();
                Class[] parametersClass = method.getParameterTypes();
//                method.invoke(o, parametersClass);

            }
        }
    }
}
