package listexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ArrayListExample {
    public static void main(String[] args) {
        //wrapper class
       // int a=100;
       // Integer b=200;
       // int d=null; - this is not possible
       // Integer c=null;
        //defining the arraylist
        List<Integer> list1=new ArrayList<>();

        //adding or inserting data
        list1.add(23);
        list1.add(12);
        list1.add(9);
        list1.add(44);
        list1.add(34);
        list1.add(12);
       // list1.add(null);
        System.out.println("list is : "+list1);

        //removing data
        list1.remove(1);
        System.out.println("list1 after removing the 1st index is : "+list1);

        //search list at specific position
        System.out.println("list1 0th index element is : "+list1.get(0));
        System.out.println("list1 3rd index element is : "+list1.get(3));

        //updating the list
        list1.set(2,55);
        System.out.println("list1 after updating the 2nd index : "+list1);

        //size of the list
        System.out.println("size of the list1 is : "+list1.size());

        //sort the list
        Collections.sort(list1);
        System.out.println("list1 after sorting is : "+list1);

        //traversing the data
        System.out.println("traversing into the list1 using for each loop");
        for(Integer l1 : list1) {
            System.out.println(l1);
        }

        List<Object>list2=new ArrayList<>();
        list2.add(23);
        list2.add("gfjdj");
        list2.add(44.554f);
        list2.add(44.545);
        list2.add(true);
        System.out.println("list2 data is : "+list2);

        List<List<Integer>> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();
        list4.add(26);
        list4.add(28);
        list4.add(29);
        list4.add(35);

        List<Integer> list5=new ArrayList<>();
        list5.add(28);
        list5.add(29);
        list5.add(29);
        list5.add(35);

        list3.add(list4);
        list3.add(list5);

        System.out.println("list3 is : "+list3);
    }
}
