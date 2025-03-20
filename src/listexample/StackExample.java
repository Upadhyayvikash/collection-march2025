package listexample;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack1=new Stack<>();

        //pushing elements into the stack
        stack1.push(23);
        stack1.push(44);
        stack1.push(12);
        stack1.push(99);

        System.out.println("stack1 is : "+stack1);

        //removing element from the stack last in first out
        stack1.pop();
        System.out.println("stack1 after 1st pop is : "+stack1);

        stack1.pop();
        System.out.println("stack1 after 2nd pop is : "+stack1);

        //traversing to the stack
        System.out.println("traversing to the stack");
        for(Integer s1:stack1){
            System.out.println(s1);
        }
    }
}
