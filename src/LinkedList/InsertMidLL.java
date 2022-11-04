// https://practice.geeksforgeeks.org/problems/insert-in-middle-of-linked-list/1?page=1&difficulty[]=-1&category[]=Linked%20List&sortBy=submissions
// Insert in Middle of Linked List

package LinkedList;

public class InsertMidLL {
    /*
Structure of node class is:
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    
    public Node insertInMid(Node head, int data){
        Node newNode = new Node(data);
        Node node = head;
        int size = 0;
        int count = 0;
        while(node != null){
            size++;
            node = node.next;
        }
        if(size % 2 == 0){
            count = 1;
        }
        node = head;
        while(node != null){
            if(count == size/2){
                Node temp = node.next;
                node.next = newNode;
                newNode.next = temp;
            }
            count++;
            node = node.next;
        }
        return node;
    }
}
}
