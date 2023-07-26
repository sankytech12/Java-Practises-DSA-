import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class MinNoOfSwaps {
    public static void main(String[] args) {
        int arr[]={10, 19, 6, 3, 5};
        int ans=solve(arr);
        System.out.println(ans);
        HashMap<Integer,Integer> map=new HashMap<>();
        map.s
    }

    private static int solve(int[] arr) {
        int [][]a=new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            a[i][0]=arr[i];
            a[i][1]=i;
        }
        Arrays.sort(a,Comparator.comparingInt(val -> val[0]));
        int ans=0;
        for (int i = 0; i < a.length; i++) {
            if(i==a[i][1]) continue;
            else{
                ans++;
                int []t={a[a[i][1]][0],a[a[i][1]][1]};
                a[a[i][1]]=new int[]{a[i][0],a[i][1]};
                a[i]=t;
                i--;
            }
        }
        return ans;
    }
}
