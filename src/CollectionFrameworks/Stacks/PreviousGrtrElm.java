//https://course.acciojob.com/idle?question=ac88cc75-d94b-411e-b84d-ca0334811442
//Previous Greater element

package CollectionFrameworks.Stacks;

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static long[] prevGreater(long[] arr, int n)
    { 
           //create a stack and push index of first elemnet to is
		Stack<Long> s = new Stack<>();
		s.push(arr[0]);
		long ans[] = new long[n];
		//previous greater for the first element is always -1
		ans[0] = -1;
		//traverse remaining element
		for(int i = 1; i<n; i++){
			//pop elements from stack
			// while stack is not empty
			// and top of stack is smaller than arr[i]
			//we always have element in decreasing order
			//in a stack
			while(s.empty() == false && s.peek() < arr[i]){
				s.pop();
			}
			// if stack becomes empty, then no elemnts is greater on
			// left side. else top of stack is previous greater
			if(s.empty() == true){
				ans[i] = -1;
			}
			else{
				ans[i] = s.peek();
			}
			s.push(arr[i]);
		}
		return ans;
    } 
}
class PreviousGrtrElm {
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new Solution().prevGreater(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
	}
}