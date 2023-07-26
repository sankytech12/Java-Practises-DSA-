import java.util.*;
public class Contest2731 {
    public static void main(String[] args) {
        int nums[]={1,0};
        int d=2;
        String s="RL";
        int ans=solve(nums,s,d);
        System.out.println(ans);
    }
    static int mod=(int)10e9+7;
    private static int solve(int[] nums, String s, int d) {
        while(d-->0){
            for (int i = 0; i < nums.length; i++) {
                if(s.charAt(i)=='R'){
                    nums[i]++;
                }else{
                    nums[i]--;
                }
            }
        }
        int ans=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                long n=Math.abs((nums[i]-nums[j]));
                ans+=(int)(n%mod);
            }
        }
        return ans;
    }
}
