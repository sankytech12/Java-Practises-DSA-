import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]arr=new int [n][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int ans=Integer.MIN_VALUE;
        Integer dp[][];
        for (int i = 0; i < arr[0].length; i++) {
            dp=new Integer[n][3];
            ans=Math.max(ans, solve(arr,0,i,dp));
        }
        System.out.println(ans);
    }

    private static int solve(int[][] arr, int i, int j,Integer [][]dp) {
        if(i==arr.length || j==arr[0].length || j<0 || i<0)return 0;
        if(i==arr.length-1) return arr[i][j];
        if(dp[i][j]!=null) return dp[i][j];
        // int r[]={1,1};
        // int c[]={1,-1};
        // int mn=Integer.MIN_VALUE;
        // for (int k = 0; k < c.length; k++) {
        //     int nr=i+r[k];
        //     int nc=j+c[k];
        //     if(nr<arr.length && nc<arr.length && nr>=0  && nc>=0){
        //         mn=Math.max(mn, arr[i][j]+solve(arr, nr, nc));
        //     }
        // }
        int rd=solve(arr, i+1, j+1,dp);
        int ld=solve(arr, i+1, j-1,dp);
        return dp[i][j]=arr[i][j]+Math.max(rd,ld);
    }
}
/*
3
10 40 70
20 50 80
30 60 90
 */