// https://leetcode.com/problems/search-in-rotated-sorted-array/
//  Search in Rotated Sorted Array

package BinarySearch;

public class SearchInRotatedArr {
    public int search(int[] arr, int target) {

        // 1st part from find min in RSA
        int l = 0, r = arr.length - 1;
        int mid;
        while (l < r) {
            mid = (l + r) / 2;
            if (arr[mid] > arr[r]) {
                l = mid + 1;
            } else if (arr[mid] < arr[r]) {
                r = mid;
            }
        }
        int minIndex = l;

        // 2nd part -> find the subarray where you'll search
        l = 0;
        r = arr.length - 1;
        if (target <= arr[r] && target >= arr[minIndex]) {
            l = minIndex;
            // r = arr.length - 1;
        } else {
            r = minIndex - 1;
            // l = 0;
        }

        // do ordinary binary search for these values of l and r
        while (l <= r) {
            mid = (l + r) / 2;
            if (arr[mid] > target) {
                r = mid - 1;
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
