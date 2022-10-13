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
        ListNode prev = null;
        ListNode hare = head, tort = head;
        while(hare != null && hare.next != null){
            prev = tort;
            hare = hare.next.next;
            tort = tort.next;
        }
        if(prev == null){// your LL only has one node
            return null;
        }
        // tort points at the node to be deleted, prev is the prev node
        prev.next = tort.next;
        return head;
    }
}
}
