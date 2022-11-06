// https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1?page=1&difficulty[]=0&category[]=Linked%20List&sortBy=submissions
// Detect Loop in linked list

package LinkedList;

public class DetectLoop {
    /*
     * Node is defined as
     * 
     * class Node
     * {
     * int data;
     * Node next;
     * Node(int d) {data = d; next = null; }
     * }
     * 
     */

    class Solution {
        // Function to check if the linked list has a loop.
        public static boolean detectLoop(Node head) {
            Node dummy = new Node(1);
            Node curr = head.next;
            Node prev = head;

            while (curr != null) {
                if (curr.next == null)
                    return false;
                prev.next = dummy;
                prev = curr;
                curr = curr.next;
                if (curr.next == dummy) {
                    return true;
                }
            }

            return false;
        }
    }
}
