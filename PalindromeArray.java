import java.util.*;
public class PalindromeArray {
    public static void main(String[] args) {
        int []q={1,2,3,4,5,90};
        int len=3;
        long []ans=solve(q,len);
    }

    private static long[] solve(int []que, int len) {
        long []ans=new long[que.length];
        int half=(len+1)/2;
        int i=0;
        long lb=(long) Math.pow(10, half-1);
        long rb=(long) (Math.pow(10, half)-1);
        for(int q:que){
            long totc=(rb-lb+1);
            if(q<=totc){
                String lf=Long.toString(lb+q-1);
                String rf=(new StringBuilder(lf)).reverse().toString();
                ans[i]=Long.parseLong(lf+rf.substring(len%2));
            }else ans[i]=-1;
            i++;
        }
       return ans;
    }    
}
