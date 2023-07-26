import java.util.*;;
public class FractinalKnap {
    public static void main(String[] args) {
       String s="abba";
        String ans=solve(s);
        System.out.println(ans);
    }

    private static String solve(String s) {
        HashSet<Character> set=new HashSet<>();
        StringBuilder sb=new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            set.remove(s.charAt(i));
            if(set.isEmpty()) break;
            char ch=set.stream().findFirst().get();
            if(ch<s.charAt(i)){
                char ch2=s.charAt(i);
                for(int j=0;j<s.length();j++){
                    if(s.charAt(j)==ch){
                        sb.deleteCharAt(j);
                        sb.insert(j, ch2);
                    } 
                    else if(s.charAt(j)==ch2){
                        sb.deleteCharAt(j);
                        sb.insert(j, ch);
                    }
                }
                break;
            }
        }
        return sb.toString();
    }
}
