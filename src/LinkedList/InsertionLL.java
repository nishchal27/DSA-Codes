// https://practice.geeksforgeeks.org/problems/linked-list-insertion-1587115620/1?page=1&difficulty[]=-1&category[]=Linked%20List&sortBy=submissions
// Linked List Insertion

package LinkedList;

public class InsertionLL {
    /*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution
{
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
        Node n = new Node(x);
        if(head == null){
            return n;
        }
            n.next = head;
            head = n;
            return head;
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        Node n = new Node(x);
        Node temp = head;
        if(head == null){
            return n;
        }
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = n;
        return head;
    }
}
}
