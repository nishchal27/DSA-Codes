// https://course.acciojob.com/idle?question=4d529a8f-2016-4c69-9c8a-61329815420a
// Palindrome Linked List

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

public class PalindromeLL {

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

    // mid
    static Node middle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // reverse
    static Node reverse(Node mid) {
        Node curr = mid, prev = null, right;
        while (curr != null) {
            right = curr.next;
            curr.next = prev;

            prev = curr;
            curr = right;
        }
        return prev;
    }

    // palindrome
    static String palindrome(Node head) {
        if (head == null) {
            return "YES";
        }
        Node mid = middle(head);
        Node last = reverse(mid.next);

        Node curr = head;
        while (last != null) {
            if (last.val != curr.val) {
                return "NO";
            }
            last = last.next;
            curr = curr.next;
        }
        return "YES";
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        for (int i = 0; i < n; i++) {
            head = add(head, sc.nextInt());
        }

        System.out.print(palindrome(head));
    }
}
