package Recursion;

import java.util.ArrayList;

public class Subsequences {

    public static ArrayList<String> getSubsequences(String str) {
        if (str.length() == 0) {
            ArrayList<String> ba = new ArrayList<>();
            ba.add("");
            return ba;
        }

        // storing first character
        char first_char = str.charAt(0);
        // removing first character
        String ss = str.substring(1); // small string

        ArrayList<String> sAns = getSubsequences(ss); // faith

        ArrayList<String> ans = new ArrayList<String>();

        // copy from sAns
        for (int i = 0; i < sAns.size(); i++) {
            String sub = sAns.get(i);
            ans.add(sub);
        }

        // add first char to every sAns element
        for (int i = 0; i < sAns.size(); i++) {
            String sub = sAns.get(i);
            String ansSub = first_char + sub;
            ans.add(ansSub);
        }
        return ans;
    }

    public static void main(String[] args){
        ArrayList<String> subs = getSubsequences("abc");
        System.out.println(subs);
    }
}
