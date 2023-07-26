import java.util.*;
public class SmartPhone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Long arr[]=new Long[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextLong();
        }
        Arrays.sort(arr,Collections.reverseOrder());
        Long ans=arr[0];
        for (int i = 1; i < arr.length; i++) {
             ans=Math.max(ans,(i+1)*arr[i]);
        }
        System.out.println(ans);
        // Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
		// long arr[] = new long[n];
		// for(int i=0; i<n; i++){
		//     arr[i] = sc.nextLong();
		// }
		// HashMap<Long,Integer> map = new HashMap<>();
	    // Arrays.sort(arr);
	    // long ma=Long.MIN_VALUE;
		// for(int i=0; i<n; i++){
		//     map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		//     ma = Math.max(ma,arr[i]*(n-i-1));
		// }
		// System.out.println(ma);
    }
}
