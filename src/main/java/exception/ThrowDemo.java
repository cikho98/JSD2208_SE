package exception;

public class ThrowDemo {
    public static void main(String[] args) {
        Person p = new Person();
        try {
            p.setAge(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("这人"+p.getAge()+"岁了");
    }

}
