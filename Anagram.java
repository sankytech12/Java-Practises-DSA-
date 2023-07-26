import java.util.*;;
public class Anagram {
    public static void main(String[] args) {
        String s="cbaebabacd";
        String t="abc";
        List<Integer> ans=solve(s,t);
        System.out.println(ans);
    }

    private static List<Integer> solve(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)+1);
        }
        List<Integer> ll=new ArrayList<>();
        int si=0,ei=s.length();
        int count=0;
        int n=t.length();
        while(ei<s.length()){
            char ch=s.charAt(ei);
            if(map.containsKey(ch)){
                if(map.get(ch)==1){
                    count++;
                }
            }
        }
        return null;
    }
}
