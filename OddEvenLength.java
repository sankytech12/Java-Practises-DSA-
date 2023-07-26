
class OddEvenLength{
    public static void main(String[] args) {
        int arr[]={2,3,4,5};
        int t=4;
        System.out.println(longestAlternatingSubarray(arr, t));
    }
     public static int longestAlternatingSubarray(int[] nums, int threshold) {
        int ans=Integer.MIN_VALUE;
        boolean f=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0 && nums[i]<=threshold){
                for(int j=i+1;j<nums.length-1;j++){
                    if(nums[j-1]%2!=nums[j]%2 && nums[j]<=threshold){
                        ans=Math.max(ans,j-i+1);
                        if(j==nums.length-2) f=true;
                    }else break;
                }
            }
        }
        if(f){
            if(nums[nums.length-1]<=threshold) ans++;
        }
        return ans;
    }
}