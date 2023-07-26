import java.util.Arrays;

public class DpPart {
    public static void main(String[] args) {
        int []arr={-36,36};
        int ans=solve(arr);
        System.out.println(ans);
    }

    private static int solve(int[] nums) {
        int tot=0;
        for(int i=0;i<nums.length;i++) tot+=nums[i];
        
        boolean dp[][]=new boolean[nums.length+1][tot+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=true;
        }
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(nums[i-1]<=j){
                    dp[i][j]=dp[i-1][j] || dp[i-1][j-nums[i-1]];
                }else dp[i][j]=dp[i-1][j];
            }
        }
        int min=Integer.MAX_VALUE;
        for (int i = 0; i <=tot/2; i++) {
            if(dp[nums.length][i]){
                min=Math.min(min, Math.abs((tot-i)-i));
            }
        }
        return min;
    }
}
