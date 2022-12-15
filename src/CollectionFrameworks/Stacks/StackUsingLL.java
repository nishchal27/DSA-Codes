package CollectionFrameworks.Stacks;
import java.util.*;

class Node {

    int data;
    Node link;

    Node(int data) {
        this.data = data;
        this.link = null;
    }
}

class StackUsingLinkedlist {

    Node top;

    StackUsingLinkedlist() {
        this.top = null;
    }

    public void push(int x) {
        Node temp = new Node(x);
        if (top == null)
            top = temp;
        else {
            temp.link = top;
            top = temp;
        }
    }

    public int peek() {
        if (top == null)
            return -1;
        return top.data;
    }

    public void pop() {
        if (top == null)
            return;
        top = top.link;
    }

    public Node display() {
        return top;
    }
}

public class StackUsingLL {
    public static void main(String[] args) {
        StackUsingLinkedlist obj = new StackUsingLinkedlist();
        Scanner sc = new Scanner(System.in);
        int q;
        q = sc.nextInt();
        while (q-- > 0) {
            int x;
            x = sc.nextInt();
            if (x == 1) {
                int y;
                y = sc.nextInt();
                obj.push(y);
            }
            if (x == 2) {
                System.out.println(obj.peek());
            }
            if (x == 3) {
                obj.pop();
            }
            if (x == 4) {
                Node temp = obj.display();
                while (temp != null) {

                    System.out.print(temp.data + " ");

                    temp = temp.link;
                }
                System.out.println();
            }
        }
    }
}
