import java.util.*;
public class CountPair {
    public static void main(String[] args) {
        int arr[]={3,1,2,2,2,1,3};
        int k=2;
        int ans=solve(arr,k);
        System.out.println(ans);
    }

    private static int solve(int[] arr, int k) {
        HashMap<Integer,ArrayList<Integer>> mp=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            //mp.put(arr[i], mp.getOrDefault(arr[i], new ArrayList<>()).add(i));
            if(!mp.containsKey(arr[i])){
                mp.put(arr[i], new ArrayList<>());
                mp.get(arr[i]).add(i);
            }else{
                 mp.get(arr[i]).add(i);
            }
        }
        int cnt=0;
        for(int key:mp.keySet()){
            if(mp.get(key).size()>1){
                ArrayList<Integer> al=mp.get(key);
            
                for (int i = 0; i < al.size(); i++) {
                    for(int j=i+1;j<al.size();j++){
                        if((al.get(i)*al.get(j))%k==0) cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}
