package thread;

public class SyncDemo1 {
    public static void main(String[] args) {
        Table table = new Table();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                while (true) {
                    int bean = table.getBeans();
                    Thread.yield();
                    System.out.println(getName() + ":" + bean);
                }
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                while (true) {
                    int bean = table.getBeans();
                    Thread.yield();
                    System.out.println(getName() + ":" + bean);
                }
            }
        };
        t1.start();
        t2.start();
    }

}

class Table {
    private int beans = 19;

    public synchronized int getBeans() {
        if (beans == 0) {
            throw new RuntimeException("没有豆子了");
        }
        Thread.yield();
        return beans--;
    }
}