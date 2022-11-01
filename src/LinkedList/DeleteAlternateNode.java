// https://practice.geeksforgeeks.org/problems/delete-alternate-nodes/1?page=1&difficulty[]=-1&category[]=Linked%20List&sortBy=submissions
// Delete Alternate Nodes

package LinkedList;

public class DeleteAlternateNode {
    /*
     * class Node {
     * int data;
     * Node next;
     * 
     * public Node(int data){
     * this.data = data;
     * }
     * }
     */
    class Solution {

        public void deleteAlternate(Node head) {
            if (head.next == null || head.next.next == null) {
                head.next = null;
                return;
            }
            Node tort = head;
            Node hare = head.next.next;
            do {
                tort.next = hare;
                tort = hare;
                if (hare.next != null)
                    hare = hare.next.next;
                if (hare.next == null) {
                    break;
                }
            } while (hare.next.next != null);
            tort.next = hare;
            tort = hare;
            tort.next = null;
            hare.next = null;
            hare = null;
        }
    }
}
