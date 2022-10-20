package map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        Integer v= map.put("语文",100);
        map.put("数学",98);
        map.put("英语",80);
        map.put("化学",90);
        map.put("物理",100);
        System.out.println(v);
        System.out.println(map);

        v= map.put("语文",50);
        System.out.println(v);
        System.out.println(map);

        v= map.get("英语");
        System.out.println(v);

        v= map.get("体育");
        System.out.println(v);


        int size = map.size();
        System.out.println(size);

        v=map.remove("英语");
        System.out.println(v);
        System.out.println(map);


        boolean ck = map.containsKey("数学");
        System.out.println("包含key"+ck);
        boolean cv = map.containsKey(99);
        System.out.println("包含key"+cv);

        map.clear();
        System.out.println(map);

    }
}
