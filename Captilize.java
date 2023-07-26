import java.util.Arrays;

public class Captilize {
    public static void main(String[] args) {
        String s="l hV";
        String ans=solve(s);
        System.out.println(ans);
        System.out.println(ans.length()+" "+s.length());
    }

    private static String solve(String s) {
        String []arr=s.trim().split(" ", 0);
        StringBuilder sb=new StringBuilder();
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            String ss=arr[i];
            if(ss.length()==1 || ss.length()==2){
                sb.append(ss.toLowerCase());
                if(i!=arr.length-1) sb.append(" ");
            }
            else{
                sb.append(Character.toUpperCase(ss.charAt(0)));
                for(int j=1;j<ss.length();j++){
                    sb.append(Character.toLowerCase(ss.charAt(j)));
                }
                if(i!=arr.length-1) sb.append(" ");
            }
        }
        return sb.toString();
    }
}
