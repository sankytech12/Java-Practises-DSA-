import java.util.*;
public class SubarrayEqualZero {
    public static void main(String[] args) {
        long arr[]= {0,0,5,5,0,0};
        int n=arr.length;
        String s="hello";
        String a=solve1(s);
        long ans=solve(arr,n);
        System.out.println(a);
    }

    private static long solve(long[] arr, int n) {
        HashMap<Long,Long> map=new HashMap<>();
        for(long m:arr){
            map.put(null, null)
        }
        return 0;
    }
    class Pair{
        int i=0,o=0;
        Pair(int i){
            this.i=i;
        }
        Pair(int i,int o){
            this.i=i;
            this.o=0;
        }
    }
    private static String solve1(String s) {
        int n=2,m=9;
        swap(n,m);
        System.out.println(n+" "+m);
      return null;
      
    }

    private static void swap(int n, int m) {
        int t=n;
        n=m;
        m=t;
    }
}
