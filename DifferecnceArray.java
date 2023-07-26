import java.util.*;
public class DifferecnceArray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int []ans=solve(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] solve(int[] arr) {
        HashMap<Integer,Integer> pmp=new HashMap<>();
        HashMap<Integer,Integer> smp=new HashMap<>();
        int ans[]=new int [arr.length];
        for (int i : arr) {
            smp.put(i, smp.getOrDefault(i, 0)+1);
        }
        int j=0;
        for(int i:arr){
            pmp.put(i, pmp.getOrDefault(i, 0)+1);
            smp.put(i, smp.get(i)-1);
            if(smp.get(i)==0) smp.remove(i);
            ans[j]=pmp.size()-smp.size();
            j++;
        }
        return ans;
    }
}