// https://practice.geeksforgeeks.org/problems/identical-linked-lists/1?page=1&difficulty[]=-1&category[]=Linked%20List&sortBy=submissions
// Identical Linked Lists

package LinkedList;

public class IdenticalLL {
    /*
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}*/

class Solution {
    
    //Function to check whether two linked lists are identical or not.
    public boolean isIdentical (Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        int count1 = 0;
        int count2 = 0;

        while(temp1 !=null && temp2 != null){
            if(temp1.data != temp2.data){
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        if(temp1 == null && temp2 == null ){
        return true;
        }else{
            return false;
        }
    }
}
}
