import java.util.*;
public class MaxPairs {
    public static void main(String[] args) {
        String arr[]={"cd","ac","dc","ca","zz"};
        int ans=solve(arr);
        System.out.println(ans);
    }

    private static int solve(String[] arr) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String s:arr){
            map.put(s,map.getOrDefault(s, 0)+1);
            
        }
        int ans=0;
        for(String str:map.keySet()){
            String r=rev(str);
            if(map.containsKey(r)){
                ans+=Math.max(map.get(str),map.get(r));
            }
            map.put(str,0);
            map.put(r,0);
        }
        System.out.println(ans);
        return 0;
    }

    private static String rev(String str) {
        int i=0,j=str.length()-1;
        char []arr=str.toCharArray();
        while(i<j){
            char t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
        return arr.toString();
    }
}
