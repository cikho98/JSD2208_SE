package thread;

public class SleepDemo2 {
    public static void main(String[] args) {
        Thread lin = new Thread(){
            @Override
            public void run() {
                System.out.println("林：睡个美容觉");
                try {
                    Thread.sleep(100000000);
                    System.out.println("睡醒了");
                } catch (InterruptedException e) {
                    System.out.println("林：干嘛了，破天了");
                }
                System.out.println("醒了");

            }
        };

        Thread huang = new Thread(){
            @Override
            public void run() {
                System.out.println("黄：大锤80！小锤40，开始砸墙");
                for (int i = 0; i < 5; i++) {
                    try {
                        Thread.sleep(1000);
                        System.out.println("80!");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("砸墙完毕");
                System.out.println("大哥！搞定！");
                lin.interrupt();
            }
        };
        lin.start();
        huang.start();
    }
}
