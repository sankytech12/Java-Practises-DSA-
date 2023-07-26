import java.util.*;
public class LeastNumberAfterKRemovavl {
    public static void main(String[] args) {
        int []arr={9,17,11,19,4,22,27,15,24,30,45,11,17,37,37};
        ss(arr);
        int k=8;
        int ans=solve(arr,k);
        System.out.println(ans);
    }

    private static void ss(int[] arr) {
        int [][]a=new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            a[i][0]=arr[i];
            a[i][1]=i;
        }
        Arrays.sort(a,(x,y) -> x[0]-y[0]);
        for(int []o:a){
            System.out.println(Arrays.toString(o));
        }
    }

    private static int solve(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:arr){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        ArrayList<Integer> ll=new ArrayList<>(map.keySet());
        Collections.sort(ll,(a,b) -> map.get(a)-map.get(b));
        int idx=0;
        int n=map.size();
        int rm=0;
        while(k>0 && idx<n){
            k-=map.get(ll.get(idx++));
            if(k>=0) rm++;
        }
        return n-rm;
    }
}
