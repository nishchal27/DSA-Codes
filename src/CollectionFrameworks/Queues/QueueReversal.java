// https://practice.geeksforgeeks.org/problems/queue-reversal/1?page=1&difficulty[]=-1&category[]=Stack&sortBy=submissions
// Queue Reversal

package CollectionFrameworks.Queues;
import java.util.*;

public class QueueReversal {
    class GfG {
        // Function to reverse the queue.
        public Queue<Integer> rev(Queue<Integer> q) {
            int n = q.size();
            Stack<Integer> s1 = new Stack<>();
            for (int i = 0; i < n; i++) {
                s1.push(q.remove());
            }
            for (int i = 0; i < n; i++) {
                q.offer(s1.pop());
            }
            return q;
        }
    }
}
