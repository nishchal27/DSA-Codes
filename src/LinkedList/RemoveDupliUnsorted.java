//https://practice.geeksforgeeks.org/problems/remove-duplicates-from-an-unsorted-linked-list/1?page=1&difficulty[]=0&category[]=Linked%20List&sortBy=submissions
// Remove duplicates from an unsorted linked list

package LinkedList;
import java.util.*;

public class RemoveDupliUnsorted {
    /* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}
*/

class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
        Set<Integer> hs = new LinkedHashSet<>();
         Node curr = head;
         Node prev = null;
         while(curr != null){
             int currVal = curr.data;
             
             if(hs.contains(currVal)){
                 prev.next = curr.next;
             }
             else{
                 hs.add(currVal);
                 prev = curr;
             }
             curr = curr.next;
         }
         return head;
    }
}
}
