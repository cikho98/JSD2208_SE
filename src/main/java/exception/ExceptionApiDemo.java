package exception;

public class ExceptionApiDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try {
            String line = "abd";
            System.out.println(Integer.parseInt(line));
        } catch (NumberFormatException e) {
            System.out.println("出错了");
            e.printStackTrace();
            String message = e.getMessage();
            System.out.println(message);
        }
        System.out.println("程序结束了");

    }
}
