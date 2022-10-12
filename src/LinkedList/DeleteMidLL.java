// https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
// Delete the Middle Node of a Linked List

package LinkedList;

public class DeleteMidLL {
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
    public ListNode deleteMiddle(ListNode head) {
        ListNode node = head;
        int count = 0;
        ListNode prev = head;
        ListNode curr = head;
        if(node == null){
            return head;
        }
        while(node != null){
            node = node.next;
            count++;
        }
        if(count == 1){
            prev = null;
            return prev;
        }
        for(int i =0; i<count/2; i++){ 
               prev = curr;
               curr = curr.next;
        }
        prev.next = prev.next.next;
        return head;
    }
}
}
