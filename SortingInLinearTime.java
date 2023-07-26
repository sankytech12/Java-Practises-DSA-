import java.util.Arrays;

public class SortingInLinearTime {
    public static void main(String[] args) {
        int []arr={2,1,2,1,0,0,0,1};
        int l=0,r=arr.length-1;
        int mid=0;
        while(mid<=r){
            if(arr[mid]==0){
                int t=arr[l];
                arr[l]=arr[mid];
                arr[mid]=t;
                mid++;
                l++;
            }else if(arr[mid]==2){
                int t=arr[r];
                arr[r]=arr[mid];
                arr[mid]=t;
                r--;
            }else{
                mid++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
