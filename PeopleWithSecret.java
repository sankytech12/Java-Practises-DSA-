import java.util.*;

public class PeopleWithSecret {
   static class Apair{
        int s,t;
        Apair(int s,int t){
            //this.f=f;
            this.s=s;
            this.t=t;
        }
    }
   static class Pair{
        int p,t;
        Pair(int p,int t){
            this.p=p;
            this.t=t;
        }
    }
    public static void main(String[] args) {
        int [][]meeting={{3,1,3},{1,2,2},{0,3,3}};
        int f=3;
        List<Integer> ans=solve(meeting,f,4);
        System.out.println(ans);
    }

    private static List<Integer> solve(int[][] meeting, int f, int n) {
        ArrayList<ArrayList<Apair>> ll=new ArrayList<>();
        for(int i=0;i<n;i++){
            ll.add(new ArrayList<>());
        }
        for(int i=0;i<meeting.length;i++){
            ll.get(meeting[i][0]).add(new Apair(meeting[i][1],meeting[i][2]));
            ll.get(meeting[i][1]).add(new Apair(meeting[i][0], meeting[i][2]));
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>(new Comparator<Pair>() {

            @Override
            public int compare(Pair o1, Pair o2) {
                // TODO Auto-generated method stub
                return o1.t-o2.t;
            }
            
        });
        pq.add(new Pair(0, 0));
        pq.add(new Pair(f, 0));
        boolean []vis=new boolean[n];
        while(!pq.isEmpty()){
            Pair rv=pq.poll();
            int p=rv.p,t=rv.t;
            if(vis[p]) continue;
            vis[p]=true;
            for(Apair r:ll.get(p)){
                if(vis[r.s]==false){
                    if(t<=r.t){
                        pq.add(new Pair(r.s, r.t));
                    }
                }
            }
        }
        List<Integer> ans=new ArrayList<>();
        for (int i = 0; i < vis.length; i++) {
            if(vis[i]) ans.add(i);
        }
        return ans;
    }
}
