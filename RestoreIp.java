import java.util.*;
public class RestoreIp {
    public static void main(String[] args) {
        String s="101023";
        List<String> ans=solve(s);
        System.out.println(ans);
    }
    private static List<String> solve(String s) {
        List<String> ans=new ArrayList<>();
        validate(s,ans,"",0,0);
        return ans;
    }

    private static void validate(String s, List<String> ans, String str, int i,int par) {
        if(i==s.length() || par==4){
            if(i==s.length() && par==4){
                ans.add(str.substring(0, str.length()-1));
            }
            return;
        }
        validate(s, ans, str+s.charAt(i)+".", i+1, par+1);
        if(i+2<=s.length() && isPossible(s.substring(i, i+2))){
            validate(s, ans, str+s.substring(i, i+2)+".", i+2, par+1);
        }
        if(i+3<=s.length() && isPossible(s.substring(i, i+3))){
            validate(s, ans, str+s.substring(i, i+3)+".", i+3, par+1);
        }
    }

    private static boolean isPossible(String substring) {
        if(substring.charAt(0)=='0') return false;
        int n=Integer.parseInt(substring);
        return n<=255;
    }
}
