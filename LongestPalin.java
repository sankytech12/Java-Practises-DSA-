import java.util.*;
public class LongestPalin {
    public static void main(String[] args) {
        String []words={"lc","cl","gg"};
        int ans=solve(words);
        System.out.println(ans);
    }

    private static int solve(String[] words) { 
        HashMap<String,Integer> map=new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0)+1);
        }
        boolean f=false;
        int ans=0;
        for (int i = 0; i < words.length; i++) {
            String t=words[i];
            if(map.containsKey(t)){
                System.out.println(2);
                StringBuilder sb=new StringBuilder(t);
                sb.reverse();
               // System.out.println(sb.toString());
                if(sb.toString().equals(t)){
                    ans+=map.get(t)/2;
                    if(map.get(t)%2==1) f=true;
                }else{
                    if(map.containsKey(sb.toString())){
                        ans+=Math.min(map.get(t), map.get(sb.toString()));
                        map.remove(t);
                    }
                }
            }else{
                System.out.println(map);
            }
        }
        ans=ans*4;
        if(f){
            ans+=4;
        }
        return ans;
    }
}
