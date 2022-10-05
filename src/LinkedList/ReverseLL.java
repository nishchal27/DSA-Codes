// https://leetcode.com/problems/reverse-linked-list/submissions/
// Reverse Linked List
package LinkedList;

public class ReverseLL {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head, prev = null, right;
        while(curr != null){
            right = curr.next; // we want to secure the LL that is coming after the current node.
            curr.next = prev; // actual link reversal
            
            // Just moving the variables for next iteration
            prev = curr;
            curr = right;
        }
        return prev;
    }
}
}
