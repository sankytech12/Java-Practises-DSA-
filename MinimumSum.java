import java.util.*;
public class MinimumSum {
    public static void main(String[] args) {
        int []arr={5,3,0,7,4};
        String ans=solve(arr);
        System.out.println(ans);
    }

    private static String solve(int[] arr) {
        Arrays.sort(arr);
        int a=0,b=0;
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                a=a*10+arr[i];
            }else{
                b=b*10+arr[i];
            }
        }
        int q=a+b;

        String ans=Integer.toString(q);
        long l=Long.parseLong(ans);
        return ans;
    }
}
