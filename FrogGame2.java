import java.util.*;
public class FrogGame2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int dp[]=new int[n];
        Arrays.fill(dp, -1);
        int ans=solve(arr,0,k,dp);
        System.out.println(ans);
    }

    private static int solve(int[] arr, int i, int k,int []dp) {
        if(i==arr.length-1) return 0;
        if(dp[i]!=-1) return dp[i];
        int cost1=Integer.MAX_VALUE;

        for (int j = 1; j <=k && i+j<arr.length; j++) {
            cost1=Math.min(cost1,Math.abs(arr[i+j]-arr[i])+solve(arr, i+j, k,dp));
        }
        return dp[i]=cost1;
    }
}
