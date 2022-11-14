// https://course.acciojob.com/idle?question=73772158-09d5-4636-aa41-def2d3158102
// Next Greater Element

package CollectionFrameworks.Stacks;
import java.util.*;

public class NxtGreatElem {
    public static void nxtGreat(long arr[], int n) {
        Stack<Long> st = new Stack<>();
        long ans[] = new long[n];
        for (int i = n - 1; i >= 0; i--) {
            // currVal = arr[i]
            while (!st.empty() && st.peek() <= arr[i]) {
                st.pop();
            }
            // I'll have removed all the elements <= arr[i]
            // I'd be having Nxt Grtr Elmnt at st.peek()
            if (st.empty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        nxtGreat(arr, n);
    }
}
