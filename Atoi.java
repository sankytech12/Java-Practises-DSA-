public class Atoi {
    public static void main(String[] args) {
        String a="-912";
        int ans=solve(a);
        System.out.println(ans);
    }

    private static int solve(String a) {
        int ans=0;
        boolean n=false;
        for (int i = 0; i < a.length(); i++) {
            char ch=a.charAt(i);
            if(i==0 && ch=='-'){
                n=true;
                continue;
            }
            if(ch>='0' && ch<='9'){
                ans=10*ans+(ch-'0');
            }
            else return -1;
        }
        
        return n==true?-1*ans:ans;
    }
}
