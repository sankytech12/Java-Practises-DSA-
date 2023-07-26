import java.util.*;

public class Contest2730 {
    public static void main(String[] args) {
        String s="1111111";
        int ans=solve(s);
        System.out.println(ans);        

    }
    private static int solve(String s) {
        int ei=1,si=0;
        int prev=-1;
        int ans=1;
        while(ei<s.length()){
            char ch=s.charAt(ei);
            if(ch==s.charAt(ei-1)){
                if(prev!=-1){
                    si=prev;
                }
                prev=ei;
            }
            ans=Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
    }
}
