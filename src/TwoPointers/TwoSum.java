// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
// Two Sum II - Input Array Is Sorted

package TwoPointers;

import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            int csum = nums[i] + nums[j];

            if (csum < target) {
                i++;
            } else if (csum > target) {
                j--;
            } else if (csum == target) {
                return new int[] { i + 1, j + 1 };
            }
        }
        return new int[] { i + 1, j + 1 };
    }

    public class Main {

        public static void main(String args[]) {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            int target = input.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = input.nextInt();
            }
            int[] arr = twoSum(nums, target);
            System.out.print(arr[0]);
            System.out.print(' ');
            System.out.print(arr[1]);
        }
    }
}
