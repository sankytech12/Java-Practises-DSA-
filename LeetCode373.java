import java.util.Arrays;
import java.util.HashSet;

public class LeetCode373 {
    public static void main(String[] args) {
        int [][]grid={{1,2,3},{3,1,5},{3,2,1}};
        int [][]ans=solve(grid);
        for(int i[]:ans){
            System.out.println(Arrays.toString(i));
        }
    }

    private static int[][] solve(int[][] grid) {
        int [][]ans=new int[grid.length][grid[0].length];
        
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                ans[i][j]=numberPlaced(grid,i,j);
            }
        }
        return ans;
    }

    private static int numberPlaced(int[][] grid,int r, int c) {
        HashSet<Integer> leftTop=new HashSet<>();
        HashSet<Integer> buttomRight=new HashSet<>();
        int i=r-1;
        for(int j=c-1;j>=0 && i>=0;j--){
            leftTop.add(grid[i][j]);
            i--;
        }
        i=r+1;
        for(int j=c+1;j<grid[0].length && i<grid.length;j++){
            buttomRight.add(grid[i][j]);
            i++;
        }
        return Math.abs(leftTop.size()-buttomRight.size());
    }
}
