package thread;

public class PriorityDemo {
    public static void main(String[] args) {
        Thread min = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("min");

                }
            }
        };

        Thread normal = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("nor");
                }
            }
        };

        Thread max = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("max");
                }
            }
        };


        min.setPriority(Thread.MIN_PRIORITY);
        max.setPriority(Thread.MAX_PRIORITY);
        min.start();
        max.start();
        normal.start();

    }
}
