import java.util.Arrays;

public class MaxMoves {
    public static void main(String[] args) {
        int [][]grid={{2,4,3,5},{5,4,9,3},{3,4,2,11},{10,9,13,15}};
        int dp[][]=new int [grid.length][grid[0].length];
        for(int []i:dp){
            Arrays.fill(i,-1);
        }
        int ans=Integer.MIN_VALUE;
        for (int i = 0; i < dp[0].length; i++) {
            ans=Math.max(ans,solve(grid,i, 0,dp));
        }
        System.out.println(ans);
    }
    static int r[]={-1,0,1};
    static int c[]={1,1,1};
    private static int solve(int[][] grid,int i,int j,int [][]dp) {
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length) return -1;
        int ans=0;
        if(dp[i][j]!=-1) return dp[i][j];
        for (int j2 = 0; j2 < r.length; j2++) {
            int nr=r[j2]+i,nc=c[j2]+j;
            if(nr<grid.length && nc<grid[0].length && grid[nr][nc]>grid[i][j]){
                ans=1+solve(grid, nr, nc,dp);
            }
        }

        return dp[i][j]=ans;
    }
}
