import java.util.Arrays;

public class PartitionSumArray {
    public static void main(String[] args) {
        int []arr={1,15,7,9,2,5,10};
        int k=3;
        int []dp=new int[arr.length];
        Arrays.fill(dp, -1);
        int ans=solve(arr,0,k,dp);
        System.out.println(ans);
    }

    private static int solve(int[] arr, int i, int k,int []dp) {
        if(i==arr.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int len=0,max=Integer.MIN_VALUE,maxAns=Integer.MIN_VALUE;
        for(int j=i;j<Math.min(arr.length,i+k);j++){
            len++;
            max=Math.max(max, arr[j]);
            int sum=len*max+solve(arr, j+1, k,dp);
            maxAns=Math.max(maxAns, sum);
        }
        return dp[i]=maxAns;
    }
}
