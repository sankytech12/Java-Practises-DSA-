import java.util.Arrays;

public class CoinPiles {
    public static void main(String[] args) {
        int []arr={1,3} ;
        int k=0;
        int ans=solve(arr,k);
        System.out.println(ans);
    }

    private static int solve(int[] arr, int k) {
        int []p=new int[arr.length];
        int ans=Integer.MAX_VALUE;
        Arrays.sort(arr);
        p[0]=arr[0];
        for (int i = 1; i < p.length; i++) {
            p[i]=p[i-1]+arr[i];
        }
        int pre=0;
        int n=arr.length;
        for (int i = 0; i < p.length; i++) {
            int ind=upper(arr, arr[i]+k);
            if(i>0 && arr[i]!=arr[i-1]){
                pre=p[i-1];
            }
            ans=Math.min(ans, pre + p[n-1]-p[ind-1] - (n-ind)*(arr[i]+k));
        }
        System.out.println(upper(arr, 4));
        return ans;
    }
    public static int upper(int []arr,int k){
        int lo=0,hi=arr.length-1;
        while(lo<hi){
            int mid=(lo+hi)>>1;
            if(arr[mid]<=k){ 
                lo=mid+1;
            }else {
              hi=mid;
            }
        }
       if(arr[lo]>k) return lo;
       if(arr[hi]>k) return hi;
       return arr.length;
    }
}
