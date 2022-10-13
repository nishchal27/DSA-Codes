// https://course.acciojob.com/idle?question=0a80f2b0-70b8-4f71-85c6-761b1313dae5
// Merge Sorted Linked Lists

package LinkedList;

import java.util.*;
import java.lang.*;
import java.io.*;

class Node {
    int val;
    Node next;
}

class LinkedList {
    Node head;

    public void insert(int val) {
        Node node = new Node();
        node.val = val;

        if (head == null) {
            head = node;
        } else {
            Node n = head; // traverse: using n to refer to the first node then
                           // move to next, next ... till null(last node)
            while (n.next != null) {
                n = n.next;
            }
            n.next = node; // insert new node to the end
        }
    }

    public void show() {
        Node node = head;
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }
}

public class MergeSortedLL {
    public static void mergeArrays(int[] arr1, int[] arr2, int n1,
            int n2, int[] arr3) {
        int i = 0, j = 0, k = 0;

        // Traverse both array
        while (i < n1 && j < n2) {
            // Check if current element of first
            // array is smaller than current element
            // of second array. If yes, store first
            // array element and increment first array
            // index. Otherwise do same with second array
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }

        // Store remaining elements of first array
        while (i < n1)
            arr3[k++] = arr1[i++];

        // Store remaining elements of second array
        while (j < n2)
            arr3[k++] = arr2[j++];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int arr2[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        int arr3[] = new int[n + m];

        mergeArrays(arr1, arr2, n, m, arr3);
        for (int i = 0; i < n + m; i++) {
            // System.out.print(arr3[i] + " ");
        }

        LinkedList l1 = new LinkedList();
        for (int i = 0; i < n + m; i++) {
            l1.insert(arr3[i]);
        }
        l1.show();
    }
}
