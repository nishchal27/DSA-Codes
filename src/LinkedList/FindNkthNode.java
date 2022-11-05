// https://practice.geeksforgeeks.org/problems/find-nk-th-node-in-linked-list/1?page=1&difficulty[]=-1&category[]=Linked%20List&sortBy=submissions
// Find n/k th node in Linked list

package LinkedList;

public class FindNkthNode {
    /*
class Node
{
    int data;
    Node next;
    
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class GfG
{
    public static int nknode(Node head, int k)
    {
        Node curr = head;
       int size = 0;
       int count = 0;
       while(curr != null){
           size++;
           curr = curr.next;
       }
       curr = head;
       double ceil = Math.ceil((double)size/k);
       while(curr != null){
       count++;
           if(count == ceil){
           return curr.data;
       }
       curr = curr.next;
       }
       return -1;
    }
}
}
