package CollectionFrameworks.Stacks;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Stack<Integer> s1 = new Stack<>(); // made an empty stack, that will store Integers

        // Add to stack
        s1.push(5);
        s1.push(9);
        s1.push(20);

        //remove from stack
        s1.pop(); // remove the top element -> 20

        //display top element
        System.out.println(s1.peek());

        // size of stack
        System.out.println(s1.size());

        //check if the stack is empty
        System.out.println("stack is empty ?  : " + s1.empty());
    }
}
