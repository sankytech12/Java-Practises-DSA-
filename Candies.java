import java.util.Arrays;

public class Candies {
    public static void main(String[] args) {
        int k=7,n=4;
        Long []ans=solve(k,n);
        System.out.println(Arrays.toString(ans));
    }

    private static Long[] solve(int k, int n) {
        Long arr[]=new Long[n];
        Arrays.fill(arr, 0l);
        int i=0;
        int count=1;
        while(k>0){
            if(count<=k){
                arr[i%n]+=count;
                i++;
                k-=count;
                count=count+1;
            }else{
                arr[i%n]+=k;
                k-=k;
            }
        }
        return arr;
    }
}
