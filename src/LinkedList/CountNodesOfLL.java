// https://practice.geeksforgeeks.org/problems/count-nodes-of-linked-list/1?page=1&difficulty[]=-1&category[]=Linked%20List&sortBy=submissions
// count node of LL

package LinkedList;

/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/
public class CountNodesOfLL {
    class Solution
    {
        //Function to count nodes of a linked list.
        public static int getCount(Node head)
        {
            
           Node node = head;
           int count = 0;
           while(node != null){
               node = node.next;
               count++;
           }
           return count;
        }
    }
}
