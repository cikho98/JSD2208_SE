package thread;

public class ThreadInfoDemo {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        String name = main.getName();
        System.out.println("线程名字："+name);
        long id = main.getId();
        System.out.println("线程唯一标识："+id);

        int priority = main.getPriority();
        System.out.println("优先级："+priority);

        boolean isAlive = main.isAlive();
        boolean isDaemon= main.isDaemon();
        boolean isInterrupted = main.isInterrupted();
        System.out.println("是否活着："+isAlive);
        System.out.println("是否为守护线程："+isDaemon);
        System.out.println("是否被中断："+isInterrupted);
    }
}
