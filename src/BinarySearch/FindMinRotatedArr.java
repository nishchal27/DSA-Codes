// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
// Find Minimum in Rotated Sorted Array

package BinarySearch;

public class FindMinRotatedArr {
    class Solution {
        public int findMin(int[] arr) {
            int l = 0, r = arr.length - 1;
            int mid;
            while (l <= r) {
                // in the last step, when l == r, we're gonna find our ans
                mid = (l + r) / 2;
                if (arr[mid] > arr[r]) {// mid lies in the 1st sub-array
                    l = mid + 1;
                } else if (arr[mid] < arr[r]) {
                    // remove mid + 1 to r from our consideration
                    r = mid;
                    // not mid -1, coz this mid could also be our ans
                    // ex. 4,5,6,7,8,1,2
                } else {// l = r, only then arr[mid] == arr[r]
                    return arr[l];
                }
            }
            // l = r (that's why you got out)
            return arr[l];
        }
    }
}
