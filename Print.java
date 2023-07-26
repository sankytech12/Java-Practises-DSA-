import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Print {
    public static void main(String[] args) {
        int n=4;
        solve(n,1);
    }

    private static void solve(int n,int i) {
        if(n==0 || i==n){
            return;
        }
        System.out.println(i);
        solve(n-1,i+1);
        System.out.println(i);
        ArrayList<Integer> kl=new ArrayList<>();
        Collections.reverse(kl);
        LinkedList<Integer> ll=new LinkedList<>();
        ll.a
        
    }
}
