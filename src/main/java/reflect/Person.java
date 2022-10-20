package reflect;

public class Person {
    private String name="张三";
    private int age =20;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello(){
        System.out.println(name+":hello");
    }

    public void sayHi(){
        System.out.println(name+": HI");
    }

    public void say(String info){
        System.out.println(name+": "+info);
    }

    public void say(String info ,int count){
        for (int i = 0; i < count; i++) {
            System.out.println(name+": "+info);
        }
    }

    public void watchTV(){
        System.out.println(name+"看电视");
    }

    public void playGame(){
        System.out.println(name+"打游戏");
    }

    public void justDoIt(){
        System.out.println(name+"只管干！");
    }

    public void eat(){
        System.out.println(name+"干饭");
    }

    public void sleep(){
        System.out.println(name+"睡觉");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private void hehe(){
        System.out.println("private的私有方法哦");
    }
}
