// https://leetcode.com/problems/binary-search/submissions/

package BinarySearch;

public class BinarySearch {
    class Solution {
        public int search(int[] arr, int target) {
            // we have 1 and r to denote the start and end of the array
            // calculate mid, move l and r based on comparison of arr[mid] and target
            
            int l = 0;
            int r = arr.length - 1;
            int mid;
            while(l <= r){
                mid = (l + r) / 2;
                if(arr[mid] == target){
                    return mid;
                }
                   else if(arr[mid] < target){
                        //list from starting point till mid is useless
                        //update the starting point correctly
                        l = mid + 1;
                    }
                else if(arr[mid] > target){
                    //list from ending point till mid is useless
                        //update the ending point correctly
                    r = mid - 1;
                }
            }
            // l > r
            return -1;
        }
    }
}
