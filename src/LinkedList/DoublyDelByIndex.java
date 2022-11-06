// https://practice.geeksforgeeks.org/problems/delete-node-in-doubly-linked-list/1?page=1&difficulty[]=-1&category[]=Linked%20List&sortBy=submissions
// Delete node in Doubly Linked List

package LinkedList;

public class DoublyDelByIndex {
    //User function Template for Java

/* Structure of linkedlist node
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int d)
	{
		data = d;
		next = prev = null;
	}
}
*/
class Solution
{
    // function returns the head of the linkedlist
    Node deleteNode(Node head,int x)
    {
	Node curr = head;
	Node behind = null;
	int size = 0;
	int count = 1;
	while(curr != null){
	    size++;
	    curr = curr.next;
	}
	curr = head;
	while(curr != null){
	    if(x == 1){
	        head = head.next;
	        return head;
	    }
	   // if(x == size){
	   //     behind.next = null;
	   //     curr.prev = null;
	   // }
	    if(count == x){
	        behind.next = curr.next;
	        curr.prev = behind;
	    }
	    count++;
	    behind = curr;
	    curr = curr.next;
	}
	return head;
    }
}
}
