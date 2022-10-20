package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * java反射机制
 * 反射是JAVA的动态机制，可以在程序【运行期间】再确定：对象实例化，方法调用
 * 属性操作等
 * 反射机制可以大大的提高代码的灵活度和扩展性，但是随之带来的是较慢的运行效率和更多的系统开心
 *
 */

public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner scan  = new Scanner(System.in);
        System.out.println("请输入你需要的类名");
        String className = scan.nextLine();
        Class cls = Class.forName(className);
        String name = cls.getName(); //获取类的完全限定名
        System.out.println(name);
        name = cls.getSimpleName(); //获取类名
        System.out.println(name);

        /*
        Method类
        Method类我的每一个实例称为“方法对象”
        该类的每个实例标识某个类中的一个方法，通过方法对象我们可以得知
        其
         */
        Method[] methods = cls.getMethods();
        System.out.println(name+"一共有"+methods.length+"个公开方法");
        for (Method method:methods){
            System.out.println(method.getName());
        }

    }
}
