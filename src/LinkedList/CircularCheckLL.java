// https://practice.geeksforgeeks.org/problems/circular-linked-list/1?page=1&difficulty[]=-1&category[]=Linked%20List&sortBy=submissions
// Check If Circular Linked List

package LinkedList;

public class CircularCheckLL {
    /* Structure of LinkedList
class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
*/
class GfG
{
    boolean isCircular(Node head)
    {
        Node node = head;
        if(node == null){
            return true;
        }
        while(node != null){
            if(node.next == head){
                return true;
            }
            node = node.next;
        }
        return false;
    }
}
}
