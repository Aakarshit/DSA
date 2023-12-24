package java.src;

public class ProductOfArrays {
    public int[] productExceptSelf(int[] nums) {
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        left[0]=nums[0];
        int n=nums.length;
        right[n-1]=nums[n-1];
        for(int i=1,j=n-2;i<n&&j>=0;i++,j--){
            left[i]=left[i-1]*nums[i];
            right[j]=right[j+1]*nums[j];
        }
        int ans[]=new int[n];
        ans[0]=right[1];
        ans[n-1]=left[n-2];
        for(int i=1;i<n-1;i++){
            ans[i]=left[i-1]*right[i+1];
        }
        return ans;
    }
}