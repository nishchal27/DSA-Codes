// https://practice.geeksforgeeks.org/problems/print-linked-list-elements/1?page=1&difficulty[]=-1&category[]=Linked%20List&sortBy=submissions

package Practice;

public class Q1 {
/* Node is defined as
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution
{
    // Print elements of a linked list on console
    // head pointer input could be NULL as well
    // for empty list
    void display(Node head)
    {
       Node node = head;
       while(node.next != null){
           System.out.print(node.data + " ");
           node = node.next;
       }
       System.out.print(node.data + " ");
    }
}
}
