//https://course.acciojob.com/idle?question=f04cbc4e-9a17-4302-8430-6b9f84ecbcb5
// Accio Job Insertion in circular linked list
package LinkedList;

import java.util.Scanner;

class Node {
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

class CircularLinkedList{
    Node last;
    void insertAtEnd(int val){
        Node n = new Node(val);
        if(last == null){// empty circular linked list
            last = n;
            n.next = n;
            return;
        }
        n.next = last.next;
        last.next = n;
        last = n;
    }
}

public class InsertInCircularLL {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CircularLinkedList l1 = new CircularLinkedList();
        for(int i = 0; i<n; i++){
            l1.insertAtEnd(sc.nextInt());
        }
        l1.insertAtEnd(sc.nextInt());
        Node head = l1.last.next;
        do{
            System.out.print(head.val + " ");
            head = head.next;
        }while(head != l1.last.next);
}
}
