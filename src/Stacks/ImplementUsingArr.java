// https://practice.geeksforgeeks.org/problems/implement-stack-using-array/1?page=1&difficulty[]=-1&category[]=Stack&sortBy=submissions
// Implement stack using array

package Stacks;

class MyStack {
    int top;
    int arr[] = new int[1000];

    MyStack() {
        top = -1;
    }

    // Function to push an integer into the stack.
    void push(int a) {
        if (top == 999) {
            return;
        }
        top++; // top is now at 0th index & so on ...
        arr[top] = a;
    }

    // Function to remove an item from top of the stack.
    int pop() {
        if (top == -1) {
            return -1;
        }
        int deletedValue = arr[top];
        top--;
        return deletedValue;
    }
}

public class ImplementUsingArr {

}
