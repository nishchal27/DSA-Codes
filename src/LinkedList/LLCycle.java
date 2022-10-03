//https://leetcode.com/problems/linked-list-cycle/
package LinkedList;

public class LLCycle {
    /**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        if(head.next == head){
            return true;
        }
        ListNode tort = head, hare = head;
        while(hare != null && hare.next != null){
            //keep running till hare reaches the end
            tort = tort.next;
            hare = hare.next.next;
            if(hare == tort){
                return true;
            }
        }
        return false;
    }
}
}
