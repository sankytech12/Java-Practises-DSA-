import java.util.*;
public class MinString {
    public static void main(String[] args) {
        String s="ABFCACDB";
        int ans=solve(s);
        System.out.println(ans);
    }

    private static int solve(String s) {
       Stack<Character> st=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(!st.isEmpty() && (s.charAt(i)=='B' && st.peek()=='A' || s.charAt(i)=='D' && st.peek()=='C')) st.pop();
            else st.push(s.charAt(i));
        }
        return st.size();
    }
}
