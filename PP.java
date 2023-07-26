public class PP {
    public static void main(String[] args) {
        String str="51230100";
        String ans=solve(str);
        System.out.println(ans);
    }
    public static String solve(String str){
        int c=0;
        int j=str.length()-1;
        while(j>=0){
            if(str.charAt(j)=='0'){
                c++;
            }else break;
        }
        if(c==str.length()) return "";
        String ans=str.substring(0, str.length()-c);
        return ans;
    }
}
