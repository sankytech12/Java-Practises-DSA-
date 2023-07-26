public class MaxMatrixRow {
    public static void main(String[] args) {
        int [][]arr={{7,2,1},{6,4,2},{6,5,3},{3,2,1}};
        int ans=solve(arr);
        System.out.println(ans);
    }

    private static int solve(int[][] nums) {
        int ans=0;
        for(int j=0;j<nums[0].length;j++){
            int max=0;
            for(int i=0;i<nums.length;i++){
                max=Math.max(max,nums[i][j]);
            }
            ans+=max;
        }
        return ans;
    }
}
