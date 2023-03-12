//https://course.acciojob.com/idle?question=b72cbf47-64e8-41e6-b6c7-285988367003
// Reverse Integer
package CollectionFrameworks.Stacks;
import java.util.*;
import java.lang.*;
import java.io.*;
class Solution{
    Stack<Integer> st= new Stack<>();
	boolean negFlag = false;
    public void reverseInteger(int x) {
		if(x < 0){
			x = Math.abs(x);
			negFlag = true;
		}
		while(x != 0){
			st.push(x % 10);
			x = x / 10;
		}
    }
	// Function to reverse the number
    public int reverse_number(int number)
    {
		int minInt = -2147483648;
		int maxInt = 2147483647;
		if(number <= minInt || number >= maxInt || number == -1){
			return 0;
		}
        // Function call to push number's
        // digits to stack
        reverseInteger(number);
        int reverse = 0;
        int i = 1;
 
        // Popping the digits and forming
        // the reversed number
        while (!st.isEmpty())
        {
            reverse = reverse + (st.peek() * i);
            st.pop();
            i = i * 10;
        }
 
        // Return the reversed number formed
		if(negFlag == true){
			reverse *= -1;
		}
        return reverse;
    }
}
public class ReverseInteger {
    public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    	int x = sc.nextInt();
            Solution obj = new Solution();
			System.out.println(obj.reverse_number(x));
	}
}
