// https://leetcode.com/problems/search-insert-position/
// Search Insert Position

package BinarySearch;

public class SearchInsertPos {
    class Solution {
        public int searchInsert(int[] arr, int target) {
            int l = 0, r = arr.length - 1;
            int mid;
            while (l <= r) {
                mid = (l + r) / 2;
                if (arr[mid] > target)
                    r = mid - 1;
                else if (arr[mid] < target) {
                    l = mid + 1;
                } else { // arr[mid] == target
                    return mid;
                }
            }
            return l;
        }
    }
}
