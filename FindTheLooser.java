import java.util.*;

class FindTheLooser{
    public static void main(String[] args) {
        int n=5;
        int k=2;
        int[] ans=solve(n,k);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] solve(int n, int k) {
        int []arr=new int[n];
        for (int i = 0,j=1; arr[i]==0; j++) {
            if(arr[i]==1) break;
            arr[i]=1;
            i=(i+j*k)%n;
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0) ans.add(i+1);
        }
        int []aa=new int[ans.size()];
        for (int i = 0; i < aa.length; i++) {
            aa[i]=ans.get(i);
        }
        return aa;
    }
}