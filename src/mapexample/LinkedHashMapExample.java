package mapexample;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map1=new LinkedHashMap<>();

        //add the data
        map1.put(103, "Banana");
        map1.put(105, "Apple");
        map1.put(107, "Orange");
        map1.put(null, "Pineapple");
        map1.put(101, null);
        map1.put(102, "Guava");
        map1.put(104, null);
        map1.put(106, "Guava");
        map1.put(107, "Mango");//orange will be remove and mango will be updated
        map1.put(103, "Orange");//banana will be removed and orange will be updated
        System.out.println("map1 is : "+map1);

        //remove value
        map1.remove(104);
        System.out.println("map1 after removing the key 104 is : "+map1);

        //traversing on map
        System.out.println("traversing on map");
        for(Map.Entry m1:map1.entrySet()){
            System.out.println(m1.getKey()+"............."+m1.getValue());
        }
    }
}
