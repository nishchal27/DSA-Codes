// https://practice.geeksforgeeks.org/problems/magical-number-1587115620/1?page=1&difficulty[]=-1&category[]=Binary%20Search&sortBy=submissions
// Magical Numbers

package BinarySearch;

public class MagicalNums {
    public static int binarySearch(int arr[], int low, int high) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid == arr[mid]) {
                return mid;
            } else if (arr[mid] > high) {
                high = mid - 1;
            } else if (mid > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
