import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int []arr={2,3,1,6,9,4};
        //int []temp=new int[arr.length];
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int i, int j) {
        if(i>=j) return;
        int mid=(i+j)/2;
        sort(arr, i, mid);
        sort(arr, mid+1, j);
        mergeSort(arr,i,mid+1,j);
    }

    private static void mergeSort(int[] arr, int l, int m, int r) {
        int i=l,k=l,j=m;
        int []temp=new int[arr.length];
        while(i<=m-1 && j<=r){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i++];
                k++;
            }
            else{
                temp[k]=arr[j++];
                k++;
            }
        }
        while(i<=m-1){
            temp[k++]=arr[i++];
        }
        while(j<=r){
            temp[k++]=arr[j++];
        }
        for (int n = l; n <=r; n++) {
            arr[n]=temp[n];
        }
        
    }
}
