public class RemovingZeros {
    public static void main(String[] args) {
        String str="51230100";
        String ans=solve(str);
        System.out.println(ans);
    }
    public static String solve(String str){
        int c=0;
        int j=str.length()-1;
        while(str.charAt(j)=='0'){
            j--;
            c++;
        }
        if(c==str.length()) return "";
        String ans=str.substring(0, str.length()-c);
        return ans;
    }
}
