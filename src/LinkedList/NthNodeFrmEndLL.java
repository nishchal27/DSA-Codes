// https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1?page=1&difficulty[]=0&category[]=Linked%20List&sortBy=submissions
// Nth node from end of linked list

package LinkedList;

public class NthNodeFrmEndLL {
    /*
     * Structure of node
     * 
     * class Node
     * {
     * int data;
     * Node next;
     * Node(int d) {data = d; next = null; }
     * }
     */

    class GfG {
        // Function to find the data of nth node from the end of a linked list.
        int getNthFromLast(Node head, int n) {
            int count = 1;
            int size = 0;
            Node curr = head;
            while (curr != null) {
                size++;
                curr = curr.next;
            }
            if (n > size) {
                return -1;
            }
            curr = head;
            int newN = n - 1;
            int stop = size - newN;

            while (curr != null) {
                if (count == stop) {
                    return curr.data;
                }
                count++;
                curr = curr.next;
            }
            return curr.data;
        }
    }
}
