import java.util.Arrays;

public class BurstBallon {
    public static void main(String[] args) {
        int []nums={1,5};
        System.out.println(maxCoins(nums));

    }
    public static int maxCoins(int[] nums) {
        
        int n=nums.length;
            //  int []arr=new int[n+2];
            //  arr[0]=1;
            //  arr[arr.length-1]=1;
            //  for (int i = 0; i < nums.length; i++) {
            //      arr[i+1]=nums[i];
            //  }
             int [][]dp=new int[nums.length+1][nums.length+1];
             for(int i[]:dp) {
                 Arrays.fill(i, -1);
             }
             return maxCoin(nums,0,n-1,dp);
         }
     
         private static int maxCoin(int[] nums, int i, int j,int [][]dp) {
             // TODO Auto-generated method stub
             if(i>j) {
                 return 0;
             }
             if(dp[i][j]!=-1) {
                 return dp[i][j];
             }
             int max=Integer.MIN_VALUE;
             for (int k = i; k <=j; k++) {
                 int le=i==0?1:nums[i-1];
                 int re=j==nums.length-1?1:nums[j+1];
                 int coins=le*nums[k]*re;
                 int lp=maxCoin(nums, i, k-1,dp);
                 int rp=maxCoin(nums, k+1, j,dp);
                 int ans=lp+rp+coins;
                 max=Math.max(max, ans);
             }
             return dp[i][j]= max;
         }
}
