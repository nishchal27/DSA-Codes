//https://course.acciojob.com/idle?question=b3346122-ef12-4cc2-b8aa-4b1d9fdda3ba
// Queue using Linked List

package CollectionFrameworks.Queues;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {

    Node front;
    Node back;
    int cnt = 0;

    public void push(int value) {
        // 1. Make a new node
        Node temp = new Node(value);

        // 2. check empty case
        if (front == null) {
            front = temp;
            back = temp;
        } else {
            back.next = temp;
            back = temp;
        }
        cnt++;
    }

    public int pop() {
        if (front == null) {
            back = null;
            return -1;
        }
        int ans = front.data;
        front = front.next;
        cnt--;
        return ans;
    }

    public int front() {
        if (front == null)
            return -1;
        return front.data;
    }

    public int getSize() {
        return cnt;
    }
}

public class QueueUsingLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int op = sc.nextInt();
            if (op == 1) {
                int x = sc.nextInt();
                q.push(x);
            } else if (op == 2) {
                System.out.println(q.pop());
            } else if (op == 3)
                System.out.println(q.front());
            else if (op == 4)
                System.out.println(q.getSize());
        }
    }
}
