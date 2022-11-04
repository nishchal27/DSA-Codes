// https://practice.geeksforgeeks.org/problems/node-at-a-given-index-in-linked-list/1?page=1&difficulty[]=-1&category[]=Linked%20List&sortBy=submissions
// Node at a given index in linked list

package LinkedList;

public class GivenIndexNode {
    /*node class of the linked list
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
   
    public static int getNth(Node node, int ind)
    {
       int count = 1;
       while(node != null){
           if(count == ind){
               return node.data;
           }
           count++;
           node = node.next;
       }
       return -1;
    }
}
}
