// https://course.acciojob.com/idle?question=7b346e14-d70f-4dc0-a82f-f3c2f3da9646
// Delete a Node; using position index.

package LinkedList;

import java.util.*;
import java.lang.*;
import java.io.*;

class Node {
    int val;
    Node next;
}

class LinkedList{
    Node head;

    public void insert(int val) {
        Node node = new Node();
        node.val = val;

        if (head == null) {
            head = node;
        } else {
            Node n = head; //traverse: using n to refer to the first node then
                          // move to next, next ... till null(last node)
            while (n.next != null) {
                n = n.next;
            }
            n.next = node; // insert new node to the end
        }
    }

    public void show(){
        Node node = head;
        while(node != null){
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public int current(int x){
        Node node = head;
        int curr = 0;
        for(int i =0; i<=x; i++){
                if(node != null){
                curr = node.val; 
                node = node.next;}
        }
        return curr;
    }

    void deleteNode(int val){
        if(head == null){
            return;
        }

        Node prev = null, curr = head;
        while(curr != null && curr.val != val){
            prev = curr; //moving forward prev will become curr
            curr = curr.next; //moving forward curr will become curr.next
        }
        // curr will point to the node that has 'val' value
        // if curr == null, that means you didn't get val in the whole LL
        if(curr == null){
            System.out.println(val + "does not exist");
            return;
        }

        // if you want to delete the head node
        if(prev == null){ // head.val = val
            head = head.next;
        }
        else { //non head node
            prev.next = curr.next; //main linking step
            curr.next = null;
            curr = null;
        }
    }
}

public class DeleteANode {
    public static void main(String[] args) {
        int curr = 0;
        LinkedList l1 = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
             l1.insert(sc.nextInt());
        }
        int x = sc.nextInt();
       curr = l1.current(x);
       l1.deleteNode(curr);
       l1.show();
    }
}

