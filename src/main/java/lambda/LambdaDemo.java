package lambda;

import java.util.*;

public class LambdaDemo {
    public static void main(String[] args) {
        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
        }
    };

        Comparator<String> c1 = (String o1,String o2) ->{
          return o1.length()-o2.length();
        };

        Comparator<String> c2 = (o1,o2)->{
            return o1.length()-o2.length();
        };

        Comparator<String> c3 = (o1,o2)->o1.length()-o2.length();

        List<String> list = new ArrayList<>();
        list.add("苍老师");
        list.add("刘山");
        list.add("小泽老师");

        System.out.println(list);
        Collections.sort(list,(o1,o2)->o1.length()-o2.length());
        System.out.println(list);


        list.sort(((o1, o2) -> o1.length()-o2.length()));
        System.out.println(list);





    }
}
