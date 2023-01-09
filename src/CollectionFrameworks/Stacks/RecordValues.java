//https://course.acciojob.com/idle?question=481f654d-3285-4ebc-af28-0e041aa79d88
// Record Values

package CollectionFrameworks.Stacks;

import java.util.*;

class Solution {

    int solve(String operation[], int n) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            String s = operation[i];
            if (s.equals("+")) {
                int a = stack.pop();
                int newScore = a + stack.peek();
                stack.push(a);
                stack.push(newScore);
            } else if (s.equals("D")) {
                stack.push(2 * stack.peek());
            } else if (s.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        int maxScore = 0;
        while (!stack.isEmpty()) {
            maxScore = maxScore + stack.pop();
        }
        return maxScore;
    }
}

public class RecordValues {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String operation[] = new String[n];
        for (int i = 0; i < n; i++)
            operation[i] = sc.next();

        Solution obj = new Solution();

        System.out.println(obj.solve(operation, n));

        sc.close();
    }
}
