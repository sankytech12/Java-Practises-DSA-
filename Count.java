import java.util.*;
public class Count {
    public static void main(String[] args) {
        int []arr={5,2,6,1};
        List<Integer> ans=solve(arr);
    }
    static class Pair{
        int n=0,i=0;
        Pair(int n,int i){
            this.n=n;
            this.i=i;
        }
        @Override
        public String toString(){
            return this.n+" "+this.i;
        }
    }
    private static List<Integer> solve(int[] arr) {
        //List<Integer> ans=new ArrayList<>(arr.length);
        int []ans=new int[arr.length];
        //List<Pair> ll=new ArrayList<>();
        Pair ll[]=new Pair[arr.length];
        for (int i = 0; i < arr.length; i++) {
           ll[i]=new Pair(arr[i], i);
        }
       mergeCount(ll,ans,0,arr.length-1);
       System.out.println(Arrays.toString(ans));
        return null;
    }
    private static void mergeCount(Pair[] ll, int [] ans, int i, int j) {
        if(i>=j) return;
        int mid=(i+j)/2;
        mergeCount(ll, ans, i, mid);
        mergeCount(ll, ans, mid+1, j);
        merge(ll,ans,i,mid,j);
    }
    private static void merge(Pair[] ll, int []ans, int left, int mid, int right) {
        int i=left;
        int j=mid+1;
        int k=0;
        //List<Integer> temp=new ArrayList<>();
        Pair []arr=new Pair[right-left+1];
        for (int l = 0; l < arr.length; l++) {
            arr[l]=new Pair(0, 0);
        }
        while(i<=mid && j<=right){
            if(ll[i].n<=ll[j].n){
                arr[k].n=ll[j].n;
                j++;
                k++;
            }else{
                ans[ll[i].i]+=right-left+1;
                arr[k].n=ll[i].n;
                i++;
                k++;
            }
        }
        while(i<=mid){
            arr[k].n=ll[i].n;
            i++;
            k++;
        }
        while(j<=right){
            arr[k].n=ll[j].n;
            j++;
            k++;
        }
        for(int q=left;q<=right;q++){
           ll[q].n=arr[q-left].n;
        }

    }
}
