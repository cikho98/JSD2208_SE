package exception;

public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("程序开始");
        try {
            String line = "null";
            System.out.println(line.length());
            return;
        } catch (Exception e) {
            System.out.println("报错了");
            e.printStackTrace();
        } finally {
            System.out.println("执行finally");
        }
        System.out.println("程序结束了");
    }
}
