import java.util.*;
public class Compatibity {
    public static void main(String[] args) {
        int n=8;
        int []arr={1,2,1,1,1,1,1,1};
        int ans=solve(arr,n);
        System.out.println(ans);
    }

    private static int solve(int[] arr, int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        int c=0;
       for(int k:map.keySet()){
        if(map.get(k)>1){
            c+=map.get(k)/2;
        }
       }
        return c;
    }
}
