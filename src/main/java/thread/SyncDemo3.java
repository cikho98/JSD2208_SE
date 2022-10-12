package thread;

public class SyncDemo3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                Foo.dosome(); }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                Foo.dosome(); }
        };

        t1.start();
        t2.start();
    }
}

class Foo{
    public  static  void dosome(){
        synchronized(Foo.class) {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + ": 正在执行dosome方法");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(t.getName() + "：执行dosome方法完毕");
        }
    }
}
