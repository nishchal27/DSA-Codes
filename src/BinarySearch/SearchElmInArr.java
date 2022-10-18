// https://practice.geeksforgeeks.org/problems/who-will-win-1587115621/1?page=1&difficulty[]=-1&category[]=Binary%20Search&sortBy=submissions
// Searching an element in a sorted array

package BinarySearch;

public class SearchElmInArr {
    static int searchInSorted(int arr[], int N, int K)
    {
        int low = 0, high = N - 1;
        while(low <= high){
            int mid = (low + high) / 2; 
            if(arr[mid] == K)
                return 1;
            else if(arr[mid] < K)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,4,6};
        System.out.println(searchInSorted(arr, 5, 6));
    }
}
