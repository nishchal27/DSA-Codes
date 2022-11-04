// https://practice.geeksforgeeks.org/problems/find-the-sum-of-last-n-nodes-of-the-linked-list/1?page=1&difficulty[]=-1&category[]=Linked%20List&sortBy=submissions
// Find the Sum of Last N nodes of the Linked List

package LinkedList;

public class SumOfLastNNodes {
    /*
Node class is as follows:

class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/
//find pos: size fo LL - k
//first find the pos from we have to start adding
//add from the pos to last

class Solution {
    
    //Return the sum of last k nodes
    public int sum(Node head, int k){
     Node curr = head;
     int sum = 0;
     int size = 0;
     int count = 0;
     
     while(curr != null){
         size++;
         curr = curr.next;
     }
     curr = head;
     while(curr != null){
         if(count >= size - k){
             sum = sum + curr.data;
         }
         curr = curr.next;
         count++;
     }
     return sum;
    }
}
}
