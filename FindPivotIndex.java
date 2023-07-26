import java.util.*;
public class FindPivotIndex {
    public static void main(String[] args) {
        int []arr={1,7,3,6,5,6};
        int ans=solve(arr);
        System.out.println(ans);
    }

    private static int solve(int[] arr) {
        int sum=0;
        int []n=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(i!=0) n[i]=arr[i]+n[i-1];
            else n[i]=arr[i];
        }
        for (int i = 1; i < n.length-1; i++) {
            int nsum=sum-arr[i];
            if(nsum-n[i-1]==n[i-1]){
                return i;
            }
        }
        if(arr[0]==n[n.length-1]) return 0;
        if(arr[arr.length-1]==n[n.length-1]) return n.length-1;
        return -1;
    }
}
