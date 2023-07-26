import java.util.*;
public class SumInTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int [][]arr=new int[n][n];
            int [][]dp=new int[arr.length][arr.length];
            for(int i[]:dp){
                Arrays.fill(i, -1);
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            int ans=solve(arr,0,0,dp);
            System.out.println(ans);
        }
    }

    private static int solve(int[][] arr, int i, int j,int [][]dp) {
        if(i==arr.length || j==arr.length) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int down=solve(arr, i+1, j,dp);
        int right=solve(arr, i+1, j+1,dp);
        return dp[i][j]=arr[i][j]+Math.max(down, right);
    }
    public static void ss(){
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int i=0;
		    while(true){
		        for(int j=0;j<=i;j++){
		            n--;
		            if(n==0) {
		                break;
		            }
		        }
		        i++;
                if(n==0) break;
		    }
            System.out.println(i+1);
		}
	
    }
}
