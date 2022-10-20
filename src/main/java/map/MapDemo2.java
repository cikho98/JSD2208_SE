package map;

import java.util.*;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("语文",100);
        map.put("数学",98);
        map.put("英语",80);
        map.put("化学",90);
        map.put("物理",100);
        System.out.println(map);

        Set<String> keySet = map.keySet();
        for (String key : keySet){
            System.out.println(key);
        }


        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        for (Map.Entry<String,Integer> entry:entrySet){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+":"+value);
        }


        Collection<Integer> values = map.values();
        for (Integer value :values){
            System.out.println("value:"+value);
        }

        values.forEach(e-> System.out.println(e));

//        values.forEach(System.out::println);


        map.forEach((k,v)-> System.out.println(k+":"+v));

    }

}
