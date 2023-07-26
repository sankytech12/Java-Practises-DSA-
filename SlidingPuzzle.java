import java.util.*;
public class SlidingPuzzle {
    public static void main(String[] args) {
        int board[][]={{4,1,2},{5,0,3}};
        int ans=solve(board);
        System.out.println(ans);
    }

    private static int solve(int[][] board) {
        LinkedList<String> qq=new LinkedList<>();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                sb.append(board[i][j]);
            }
        }
       
        int [][]swapidx={{1,3},{0,2,4},{1,5},{0,4},{3,1,5},{4,2}};
        String add=sb.toString();
        qq.add(add);
        HashSet<String> hs=new HashSet<>();
        int lev=0;
        String target="123450";
        while(!qq.isEmpty()){
            int size=qq.size();
            while(size-->0){
                String rem=qq.remove();
                if(rem.equals(target)) return lev;
                int idx=rem.indexOf('0');
                int swap[]=swapidx[idx];
                for (int i = 0; i < swap.length; i++) {
                    String toAdd=getSwapped(rem,idx,swap[i]);
                    if(hs.contains(toAdd)) continue;
                    hs.add(toAdd);
                    qq.add(toAdd);
                }
            }
            lev++;
        }
        return -1;
    }

    private static String getSwapped(String rem, int i, int j) {
        StringBuilder sb=new StringBuilder(rem);
        sb.setCharAt(i,rem.charAt(j));
        sb.setCharAt(j, rem.charAt(i));
        return sb.toString();
    }
}
