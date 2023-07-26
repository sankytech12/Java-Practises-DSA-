public class ConstructLongestSubstring {
    public static void main(String[] args) {
        int x=2,y=5,z=1;
        int [][][][]dp=new int[x][y][z][4];
        System.out.println(solve(x,y,z,0,dp));
    }
    
    private static int solve(int x, int y, int z,int last, int [][][][]dp) {
        if(dp[x][y][z][last] != 0) return dp[x][y][z][last];
        int res = 0;
        if(x > 0 && last != 1) res = Math.max(res, 2 + solve(x-1, y, z, 1,dp));
        if(y > 0 && last <= 1) res = Math.max(res, 2 + solve(x, y-1, z, 2,dp));
        if(z > 0 && last != 1) res = Math.max(res, 2 + solve(x, y, z-1, 3,dp));
        return dp[x][y][z][last] = res;
    }
}
