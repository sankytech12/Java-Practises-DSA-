import java.util.*;
class Pair implements Comparable<Pair>{
    int first,second;
    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
    @Override
    public String toString(){
        return this.first+" "+this.second;
    }
    @Override
    public int compareTo(Pair o) {
        // TODO Auto-generated method stub
        if(this.second==o.second) return this.first-o.first;
        return this.second-o.second;
    }

}
class Job{
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
    
}
public class Nmeeting {
    public static void main(String[] args) {
        int []start={1,3,0,5,8,5};
        int  end[] =  {2,4,6,7,9,9};
        int ans=solve(start,end,start.length);
        System.out.println(ans);
    }

    private static int solve(int[] start, int[] end, int n) {
        ArrayList<Pair> al=new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        
        for (int i = 0; i < end.length; i++) {
            al.add(new Pair(start[i],end[i]));
        }
        Pair []arr=new Pair[5];
        //Arrays.sort(arr,(o1, o2) -> o2.profit-o1.profit);
        // Collections.sort(al,new Comparator<Pair>() {

        //     @Override
        //     public int compare(Pair o1, Pair o2) {
        //         // TODO Auto-generated method stub
        //         if(o1.second==o2.second) return o1.first-o2.second;
        //         return o1.second-o2.second;
        //     }
            
        // });
        HashMap<Integer,Integer> map=new HashMap<>();
        
        Collections.sort(al);
        System.out.println(al);
        int i=0,j=1,c=1;
        while(j<n){
            if(al.get(i).second<al.get(j).first){
                c++;
                i=j;
                j++;
            }else j++;
        }
        return c;

       

    }
}
