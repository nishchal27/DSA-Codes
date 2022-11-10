// https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1?page=1&difficulty[]=0&category[]=Linked%20List&sortBy=submissions
// Add 1 to a number represented as linked list

package LinkedList;

public class Add1ToNumAsLL {
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
    public static Node reverse(Node head){
            Node prev = null, curr = head, right;
            while(curr != null){
                right = curr.next;
                curr.next = prev;
                
                prev = curr;
                curr = right;
            }
            return prev;
        }
    public static Node addOne(Node head) 
    { 
        head = reverse(head);
        
        Node curr = head, prev = head;
        int sum = curr.data + 1;
        curr.data = sum % 10;
        int carry = sum / 10;
        
        curr = curr.next;
        
        while(curr != null){
            sum = curr.data + carry;
            curr.data = sum % 10;
            carry = sum / 10;
            prev = curr;
            curr = curr.next;
        }
        if(carry != 0){
            prev.next = new Node(carry);
        }
        head = reverse(head);
        return head;
    }
}
}
