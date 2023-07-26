import java.util.Arrays;

public class MCM {
    public static void main(String[] args) {
        int arr[]= {40, 20, 30, 10, 30};
        int ans=solve(arr,arr.length);
        System.out.println(ans);
    }

    private static int solve(int[] arr, int length) {
        int [][]dp=new int[length][length];
        for (int i = 1; i < dp.length-1; i++) {
            for (int j = i+1; j < dp.length; j++) {
                int min=(int)10e9;
                for (int k = i; k < j; k++) {
                    int steps=arr[i-1]*arr[k]*arr[j]+dp[i][k]+dp[k+1][j];
                    min=Math.min(min, steps);
                }
                dp[i][j]=min;
            }
        }
        for (int[] is : dp) {
            System.out.println(Arrays.toString(is));
        }
        return dp[1][length-1];
    }
}
