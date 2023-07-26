import java.util.*;

class LastStoneWeight{
    public static void main(String[] args) {
        int []arr={2,7,4,1,8,1};
        int ans=solve(arr);
        System.out.println(ans);
    }

    private static int solve(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones) pq.add(i);
        while(pq.size()>1){
            int f=pq.poll();
            int s=pq.poll();
            if(f!=s){
                pq.add(Math.abs(f-s));
            }
        }

        return pq.peek();
    }
}