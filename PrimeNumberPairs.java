import java.util.*;
public class PrimeNumberPairs {
    public static void main(String[] args) {
        int n=5;
        String str1 = "ab";
String str2 = "ab";
String str3 = "World";

boolean isEqual1 = str1.equals(str2); // true
boolean isEqual2 = str1.equals(str3); // false

        //List<List<Integer>> ans=solve(n);
        System.out.println(str1.equals(str2));
    }

    private static List<List<Integer>> solve(int n) {
        List<List<Integer>> ans=new ArrayList<>();
        boolean prime[]=new boolean[n+1];
        prime[0]=true;
        prime[1]=true;
        for(int i=2;i*i<=n;i++){
            if(prime[i]==false){
                for(int mul=2;mul*i<=n;mul++){
                    prime[i*mul]=true;
                }
            }
        }
        for (int i = 2; i < prime.length/2+1; i++) {
            if(prime[i]==false){
                int ni=n-i;
                if(i<=ni){
                if(prime[ni]==false){
                   List<Integer> ll=new ArrayList<>(Arrays.asList(i,ni));
                   ans.add(ll);
                }
            }
            }
        }
        return ans;

    }
}
