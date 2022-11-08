package CollectionFrameworks.Queues;
import java.util.*;

import java.util.LinkedList;

public class QueueImplement {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();

        //insert element and return true or false
    queue.offer(1);
    queue.offer(2);
    queue.offer(3);

    // Queue is FIFO based approach 
    System.out.println(queue);

    //remove first element and return it
    System.out.println(queue.poll());


}
}
