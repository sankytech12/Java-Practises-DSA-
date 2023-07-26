import java.util.*;

public class Stock {
   static class Pair{
        int val;
        int i;
        Pair(int val,int i){
            this.val=val;
            this.i=i;
        }
        @Override
        public String toString(){
            return this.val+" "+this.i;
        }
    }
    public static void main(String[] args) {
        int []arr={10,7,19};
        int k=45;
        int ans=solve(arr,k);
        System.out.println(ans);
    }
    private static int solve(int[] arr, int k) {
        ArrayList<Pair> al=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
           al.add(new Pair(arr[i], i+1));
        }
        Collections.sort(al,new Comparator<Pair>() {

            @Override
            public int compare(Stock.Pair o1, Stock.Pair o2) {
                // TODO Auto-generated method stub
                return o1.val-o2.val;
            }
            
        });
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            int price=al.get(i).val;
            int stock=al.get(i).i;
            if(price*stock<=k){
                ans+=stock;
                k-=price*stock;
            }else{
                ans+=(k/price);
                k-=price*(k/price);
            }
        }
        return ans;
    }
}
