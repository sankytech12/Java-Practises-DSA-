import java.util.*;
class Palindrome{
    public static void main(String[] args) {
        ArrayList<Integer> ll=new ArrayList<>();
        int n=-121;
        int temp=n;
        int r=0;
        int sum=0;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        System.out.println(sum);
    }
}