import java.util.*;
public class MergeKSortedArray {
    public static void main(String[] args) {
        int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<Integer> ans=solve(arr,arr.length);
        System.out.println(ans);
    }
    static class Pair{
        int val,ai,vi;
        Pair(int val,int ai,int vi){
            this.val=val;
            this.ai=ai;
            this.vi=vi;
        }


    }
    private static ArrayList<Integer> solve(int[][] arr, int k) {
        ArrayList<Integer> ans=new ArrayList<>();
        PriorityQueue<Pair> pq=new PriorityQueue<>(new Comparator<Pair>() {

            @Override
            public int compare(Pair o1, Pair o2) {
                // TODO Auto-generated method stub
                return o1.val-o2.val;
            }
            
        });
        for(int i=0;i<arr.length;i++){
            pq.add(new Pair(arr[i][0], i, 0));
        }
        while(!pq.isEmpty()){
            Pair rv=pq.poll();
            ans.add(rv.val);
            int ai=rv.ai,vi=rv.vi;
            if(vi+1<arr[ai].length){
                pq.add(new Pair(arr[ai][vi+1], ai, vi+1));
            }
        }
        return ans;
    }
}
