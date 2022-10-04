//https://leetcode.com/problems/delete-node-in-a-linked-list/submissions/
package LinkedList;

public class DeleteNode {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
     //cur
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
}
