import java.util.*;
public class Strings {
    public static void main(String[] args) {
        String s="timetopractice";
        String t="toc";
        String ans=solve(s,t);
        System.out.println(ans);
    }

    private static String solve(String s, String t) {
       int si=0,ei=0;
       int ws=Integer.MAX_VALUE;
       int start=-1;
       int []frqs=new int[256];
       int []frqt=new int[256];
 
    for (int i = 0; i < t.length(); i++) {
        frqt[t.charAt(i)]++;
    }
    int count=0;
       while(ei<s.length()){
            char ch=s.charAt(ei);
            frqs[ch]++;
            if(frqt[ch]>=frqs[ch]) count++;
            if(count==t.length()){
                while(frqs[s.charAt(si)]>frqt[s.charAt(si)]){
                    frqs[s.charAt(si)]--;
                    si++;
                }
                if(ws>ei-si+1){
                    ws=ei-si+1;
                    start=si;
                }
            }
            ei++;
       }
       if(start==-1) return "-1";
        return s.substring(start, start+ws);
    }
    
}
