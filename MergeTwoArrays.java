import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
       int [][] nums1 = {{1,2},{2,3},{4,5}}, nums2 = {{1,4},{3,2},{4,1}};
       int [][] ans=solve(nums1,nums2);
    for(int i[]:ans){
        System.out.println(Arrays.toString(i));
    }
    }

    private static int[][] solve(int[][] nums1, int[][] nums2) {
        int i=0,n1=nums1.length;
        int j=0,n2=nums2.length;
        int k=0,l=0,m=0;
        int len=n1+n2;
        int [][]ans=new int[n1+n2][2];
        while(i<n1 && j<n2){
            if(nums1[i][0]<nums2[j][0]){
                ans[m]=nums1[i];
                m++;i++;
            }
            else if(nums1[i][0]==nums2[j][0]){
                ans[m][0]=nums1[i][0];
                ans[m][1]=nums1[i][1]+nums2[j][1];
                m++;
                i++;
                j++;
                len--;
            }else if(nums1[i][0]>nums2[j][0]){
                ans[m]=nums2[j];
                m++;
                j++;
            }
        }
        while(i<n1){
            ans[m]=nums1[i];
            m++;
            i++;
        }
        while(j<n2){
            ans[m]=nums2[j];
            m++;
            j++;
        }
        if(len<n1+n2){
            int [][]nans=new int[len][2];
            for (int n = 0; n < nans.length; n++) {
                for (int n3 = 0; n3 < nans[0].length; n3++) {
                    nans[n][n3]=ans[n][n3];
                }
            }
            return nans;
        }
       
        return ans;
    }
}
