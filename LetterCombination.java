import java.util.*;
public class LetterCombination {
    static String []arr={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        String digit="23";
        
        List<String> ans=new ArrayList<>();
        solve(digit,"",ans);  
        System.out.println(ans);      

    }
    private static void solve(String digit,String ans,List<String> a) {
        if(digit.length()==0){
            a.add(ans);
            return;
        }
        char ch=digit.charAt(0);
        String letters=arr[(ch-'0')-2];
        for (int i = 0; i < letters.length(); i++) {
            solve(digit.substring(1), ans+letters.charAt(i), a);
        }
        
    }
}
