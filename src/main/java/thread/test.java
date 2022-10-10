package thread;

public class test {

    public static void main(String[] args) {
        printHello(1);
    }
    public static void printHello(int n) {
        if (n > 10) {
            return;
        }
        System.out.println("hello");
        printHello(n+1);
    }
}
