// https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1?page=1&difficulty[]=0&category[]=Linked%20List&sortBy=submissions
// Finding middle element in a linked list

package LinkedList;

public class FindMidElem {
    /*
     * Node of a linked list
     * class Node {
     * int data;
     * Node next;
     * Node(int d) { data = d; next = null; }
     * }
     */

    class Solution {
        int getMiddle(Node head) {
            Node tort = head;
            Node hare = head;

            while (hare != null && hare.next != null) {
                tort = tort.next;
                hare = hare.next.next;
                // here Hare is running 2x speed of tort,
                // so Hare will reach at end when tort is just at the middle.
            }
            return tort.data;
        }
    }
}
