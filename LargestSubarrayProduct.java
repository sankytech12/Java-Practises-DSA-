import java.util.Arrays;

public class LargestSubarrayProduct {
    public static void main(String[] args) {
        int []arr={2,3,-4,5};
    
        
        int ans=solve(arr);
        System.out.println(ans);
    }

    private static int solve(int[] arr) {
        int ans=arr[0],max=ans;
       int min=ans;
       for (int i = 1; i < arr.length; i++) {
            if(arr[i]<0){
                int t=min;
                 min=max;
                 max=t;
            }
            max=Math.max(arr[i], arr[i]*max);
            min=Math.min(arr[i],arr[i]*min);
            ans=Math.max(ans, max);
       }
       return ans;
    }

    private static void swap(int min, int max) {
        int t=min;
        min=max;
        max=t;
    }
}
