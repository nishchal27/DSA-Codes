// https://practice.geeksforgeeks.org/problems/intersection-of-two-linked-list/1?page=2&difficulty[]=0&category[]=Linked%20List&sortBy=submissions
// Intersection of Two Linked Lists

package LinkedList;

public class InterSectionOfTwoLL {
    /*
     * structure of list Node:
     * 
     * class Node
     * {
     * int data;
     * Node next;
     * 
     * Node(int a)
     * {
     * data = a;
     * next = null;
     * }
     * }
     * 
     */

    class Solution {
        static Node head;

        public static void insert(int val) {
            Node node = new Node(val);
            if (head == null) {
                head = node;
                return;
            }
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = node;
            return;
        }

        public static Node findIntersection(Node head1, Node head2) {
            Set<Integer> set = new LinkedHashSet<>();
            Node list1 = head1, list2 = head2;
            Node dummy = new Node(-1);
            Node temp = dummy;

            while (list2 != null) {
                set.add(list2.data);
                list2 = list2.next;
            }

            while (list1 != null) {
                if (set.contains(list1.data)) {
                    Node node = new Node(list1.data);
                    temp.next = node;
                    temp = node;
                }
                list1 = list1.next;
            }
            return dummy.next;
        }
    }
}
