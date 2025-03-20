package setexample;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> set1 = new LinkedHashSet<>();

        //add element
        set1.add("mango");
        set1.add("banana");
        set1.add("guava");
        set1.add("pineapple");
        set1.add(null);
        set1.add("banana");

        System.out.println("set1 element is : "+set1);

        //removing element
        set1.remove("pineapple");
        System.out.println("elements after removing the element is : "+set1);

        //traversing on set1
        System.out.println("traversing");
        for(String s1:set1){
            System.out.println(s1);
        }

        //size
        System.out.println("size of set1 is : "+set1.size());

        //traversing
        System.out.println("traversing");
        for(String s1 : set1){
            System.out.println(s1);
        }
    }
}
