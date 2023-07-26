import java.util.*;
public class FrogGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int []dp=new int[n];
        Arrays.fill(dp, -1);
        int ans=solve(arr,0,arr.length,dp);
        System.out.println(ans);
    }

    private static int solve(int[] arr, int i,int n,int []dp) {
        if(i==n-1) return 0;
        if(dp[i]!=-1) return dp[i];
        int cost1=Math.abs(arr[i+1]-arr[i])+solve(arr, i+1, n,dp);
        int cost2=Integer.MAX_VALUE;
        if(i+2<n){
            cost2=Math.abs(arr[i+2]-arr[i])+solve(arr, i+2, n,dp);
        }
        return dp[i]=Math.min(cost1, cost2);
    }
}
/*4
10 30 40 20 */