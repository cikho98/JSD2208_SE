package thread;

public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread rose = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    try {
                        Thread.sleep(1000);
                        System.out.println("rose:let me go");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("扑通");
                System.out.println("rose:aaaaaaaaaaaaaAAAA");
            }
        };

        Thread jack = new Thread(){
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(1000);
                        System.out.println("jack:you jump! I jump!");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        rose.start();
        jack.setDaemon(true);
        jack.start();

//        while (true);
    }
}
