// https://course.acciojob.com/idle?question=a6a656df-2ec3-499e-93b4-7e7f224bcd97
// Remove duplicates from Linked Lists

package LinkedList;

import java.util.*;
import java.lang.*;
import java.io.*;

class Node {
    int val;
    Node next;

    // constructor
    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RemoveDuplicates {
    static Node add(Node head, int val) {
        // I want to add node in the end
        Node n = new Node(val);
        if (head == null)
            return head = n;
        // I want to move to the last node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        // now i'm at a node where temp.next == null
        // I'm at the last node
        temp.next = n;
        return head;
    }

    static Node removeDuplicates(Node head) {
        Node curr = head;
        while (curr != null) {
            // I want to remove duplicate for the current node
            while (curr.next != null && curr.next.val == curr.val) {
                curr.next = curr.next.next;
            }
            // I've removed duplicates
            // I want to consider next node for the next iteration
            curr = curr.next;
        }
        return head;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        for (int i = 0; i < n; i++) {
            head = add(head, sc.nextInt());

        }
        head = removeDuplicates(head);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
