import java.util.*;
public class Contest2729 {
    public static void main(String[] args) {
        int n=123;
       // boolean ans=solve(n);
       char c='a';
       char ch='k';
       c=ch;
        System.out.println(c);
    }

    private static boolean solve(int n) {
        String n2=Integer.toString(2*n);
        String n3=Integer.toString(3*n);
        String str=Integer.toString(n);
       str=str+n2+n3;
        boolean ans=true;
        int []arr=new int[10];
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='0'){
                ans=false;
                break;
            }
            System.out.print(str.charAt(i)-'0');
            arr[str.charAt(i)-'0']++;
            if(arr[str.charAt(i)-'0']>1){
                ans=false;
                break;
            }
        }
        return ans;
    }
}
