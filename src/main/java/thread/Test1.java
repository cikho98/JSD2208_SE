package thread;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入倒计时间：");
        int time = scan.nextInt();
        for (int i = time; i > 0; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("倒计时："+i+"秒");
        }
        System.out.println("时间到");
    }
}
