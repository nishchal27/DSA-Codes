// https://practice.geeksforgeeks.org/problems/modular-node/1?page=1&difficulty[]=-1&category[]=Linked%20List&sortBy=submissions
// Modular Node

package LinkedList;

public class ModularNode {
    /*
     * node class of the linked list is as:
     * class Node {
     * int data;
     * Node next;
     * Node(int key)
     * {
     * data = key;
     * next = null;
     * }
     * }
     */
    // Your task is to complete the function
    // function should return the modular Node
    // if no such node is present then return -1
    class GfG {
        public static int moduarNode(Node head, int k) {
            Node curr = head;
            int size = 0;
            int count = 1;
            int res = -1;
            while (curr != null) {
                size++;
                curr = curr.next;
            }
            if (k > size) {
                return res;
            }
            curr = head;
            while (curr != null) {
                if (count % k == 0) {
                    res = curr.data;
                }
                count++;
                curr = curr.next;
            }
            return res;
        }
    }
}
