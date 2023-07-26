import java.util.*;
public class FriendPairing {
    public static void main(String[] args) {
        int n=6569;
        long dp[]=new long[n+1];
        Arrays.fill(dp, -1l);
        long ans=solve(n,dp);
        System.out.println(ans);
    }
    static int mod=1000000007;
    private static long solve(int n,long []dp) {
        if(n<=2) return n;
        if(dp[n]!=-1) return dp[n];
        long single=(solve(n-1,dp))%mod;
        long pairing=(((n-1)%mod)*solve(n-2,dp)%mod)%mod;
        return dp[n]=single+pairing;
    }
}
