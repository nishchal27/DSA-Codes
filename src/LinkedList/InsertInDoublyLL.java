//Insert node in a doubly linked list; accio job
// https://course.acciojob.com/idle?question=c44249e8-0776-4bcf-883d-fbdad0c956a9

import java.util.Scanner;

class Node{
    int val;
    Node next,prev;
    Node(int val){
            this.val = val;
    }
}

class LinkedList{
    Node head, tail;
    void insertAtEnd(int val){
            Node n = new Node(val);
            if(head == null){
                    head = n;
                    tail = n;
                    return;
            }
            //head != null
            tail.next = n;
            n.prev = tail;
            tail = n;
    }

    void insertAtStart(int val){
            Node n = new Node(val);
            if(head ==  null){
                    head = n;
                    tail = n;
                    return;
            }
            //head != null
            head.prev = n;
            n.next = head;
            head = n;
    }
}

public class InsertInDoublyLL {
    public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int k = sc.nextInt();
                LinkedList l1 = new LinkedList();
                for(int i =0; i<n; i++){
                        l1.insertAtEnd(sc.nextInt());
                }
                l1.insertAtStart(k);
                Node temp = l1.head;
                while(temp != null){
                        System.out.print(temp.val + " ");
                        temp = temp.next;
                }
	}
}
