import java.util.*;
public class JumpGame {
    public static void main(String[] args) {
        int arr[]={1, 0,2} ;
        int dp[]=new int[arr.length];
        Arrays.fill(dp, -1);
        System.out.println(solve(arr, 0,dp));
    }
    public static boolean solve(int []arr,int i,int []dp){
        if(i==arr.length-1) {
            dp[i]=1;
            return true;
        }
        if(i>arr.length-1) {
            dp[i]=0;
            return false;
        }
        if(dp[i]!=-1) return dp[i]==0?false:true;
        for(int j=1;j<=arr[i];j++){
            if(solve(arr, i+j,dp)){
                dp[i]=1;
                 return true;
            }
        }
        dp[i]=0;
        return false;
    }
}
