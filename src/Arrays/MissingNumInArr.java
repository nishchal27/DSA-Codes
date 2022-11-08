// https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&difficulty[]=0&category[]=Arrays&sortBy=submissions
// Missing number in array

package Arrays;

public class MissingNumInArr {
    class Solution {
        int MissingNumber(int array[], int n) {
            int count = 0;
            int totalSum = 0;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                count++;
                totalSum = count + totalSum;
            }
            for (int i = 0; i < n - 1; i++) {
                sum = sum + array[i];
            }
            return totalSum - sum;
        }
    }
}
