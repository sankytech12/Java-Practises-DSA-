import java.util.Arrays;

public class LexSmallestPalin {
    public static void main(String[] args) {
        String s="egcfe";
        String ans=solve(s);
        System.out.println(ans);
    }

    private static String solve(String s) {
        char arr[]=s.toCharArray();
        int i=0,j=arr.length-1;
        while(i<=j){
            if(arr[i]!=arr[j]){
                if(arr[i]>arr[j]) arr[i]=arr[j];
                else arr[j]=arr[i];
            }
            i++;
            j--;
        }
       String ans=String.valueOf(arr);
        return ans;
    }
}
