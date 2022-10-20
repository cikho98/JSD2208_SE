package reflect;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton(){
        System.out.println("单列模式的构造方法");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
