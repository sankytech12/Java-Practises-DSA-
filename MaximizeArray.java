import java.util.*;
public class MaximizeArray {
    public static void main(String[] args) {
        int []a={7, 4, 8, 0, 1};
        int []b={9, 7, 2, 3, 6};
        ArrayList<Integer> ans=solve(a,b);
        System.out.println(ans);
    }

    private static ArrayList<Integer> solve(int[] a, int[] b) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
       // Arrays.sort(a);
        for (int i = 0; i < b.length; i++) {
           if(a[i])
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for (int i = b.length-1; i >=0; i--) {
            if(a[i]>pq.peek()){
                ans.add(b[i]);
            }else{
                ans.add(pq.poll());
            }
        }
        return ans;
    }
}
