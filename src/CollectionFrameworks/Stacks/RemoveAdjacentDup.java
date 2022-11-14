// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
// Remove All Adjacent Duplicates In String

package CollectionFrameworks.Stacks;
import java.util.*;

public class RemoveAdjacentDup {
    class Solution {
        public String removeDuplicates(String s) {
            Stack<Character> st = new Stack<>();
            for(int i = 0; i<s.length(); i++){
                if(!st.empty() && st.peek() == s.charAt(i)){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }
            String ans = "";
            while(!st.empty()){
                ans = st.pop() + ans;
            }
            return ans;
        }
    }
}
