public class MaximumOr {
    public static void main(String[] args) {
        int nums[]={8,1,2};
        int k=2;
        long ans=solve(nums,k);
        System.out.println(ans);
    }

    private static long solve(int[] nums, int k) {
        int n=nums.length;
        long []pre=new long[n];
        long []suf=new long[n];
        pre[0]=nums[0];
        for (int i = 1; i < suf.length; i++) {
            pre[i]=pre[i-1]|nums[i];
        }
        suf[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suf[i]=suf[i+1]|nums[i];
        }
        long ans=0;
        for (int i = 0; i < suf.length; i++) {
            long or=((long)nums[i]*(1<<k) | (i>0?pre[i-1]:0) | (i<n-1?suf[i+1]:0));
            ans=Math.max(ans,or );
        }

        return ans;
    }
}
