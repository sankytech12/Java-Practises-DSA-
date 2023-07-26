import java.util.*;
public class Completeness {
  
    public static void main(String[] args) {
        int [][]edges={{0,1},{0,2},{1,2},{3,4},{3,5}};
        int n=6;
        HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
        for (int i = 0; i <n; i++) {
            map.put(i,new HashMap<>());
        }
        for (int i = 0; i < edges.length; i++) {
            map.get(edges[i][0]).put(edges[i][1], 0);
            map.get(edges[i][1]).put(edges[i][0], 0);
        }
        LinkedList<Integer> qq=new LinkedList<>();
        HashSet<Integer> vis=new HashSet<>();
        int count=0;
        
        for(int src:map.keySet()){
            int e=0;
            int branches=0;
            if(!vis.contains(src)) {
            
            qq.add(src);
            while(!qq.isEmpty()){
                int rv=qq.remove();
                if(!vis.contains(rv)){
                e++;
                branches+=map.get(rv).size();
                vis.add(rv);   
                for(int nbrs:map.get(rv).keySet()){
                    if(!vis.contains(nbrs)) {
                        qq.add(nbrs);
                    }
                }
             }
            }
            System.out.println(e+" "+branches);
             if(e*(e-1)==branches) {
                count++;
            }
            }
        }
        // for(int i=0;i<n;i++){
        //     int[]in=new int[2];
        //     if(!vis.contains(i)){
        //         dfs(map,i,in,vis);
        //         if(in[0]*(in[0]-1)==in[1]) count++;
        //     }
        // }
        System.out.println(count);
    }

    private static void dfs(HashMap<Integer, HashMap<Integer, Integer>> map, int i,int []in,
            HashSet<Integer> vis) {
                in[0]++;
                in[1]+=map.get(i).size();
                vis.add(i);
                for(int nbrs:map.get(i).keySet()){
                    if(!vis.contains(nbrs)){
                        dfs(map, nbrs, in, vis);
                    }
                }
    }
}
