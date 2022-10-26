// https://practice.geeksforgeeks.org/problems/implement-stack-using-linked-list/1?page=1&difficulty[]=-1&category[]=Stack&sortBy=submissions
// Implement Stack using Linked List

package Stacks;

class MyStack {
    // class StackNode {
    // int data;
    // StackNode next;
    // StackNode(int a) {
    // data = a;
    // next = null;
    // }
    // }
    StackNode top;// treat this as your head variable

    // Function to push an integer into the stack.
    void push(int a) // insert at top
    {
        // code same as inserting at head
        StackNode n = new StackNode(a);
        if (top == null) { // top is like head
            top = n;
            return;
        }
        n.next = top;
        top = n;
    }

    // Function to remove an item from top of the stack.
    int pop() {
        if (top != null) {
            int deletedValue = top.data;
            top = top.next;
            return deletedValue;
        } else
            return -1;
    }
}

public class ImplementUsingLL {

}
