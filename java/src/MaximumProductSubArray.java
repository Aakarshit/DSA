package java.src;

public class MaximumProductSubArray {
    public int maxProduct(int[] nums) {
        int prod=1;
        int ans=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            prod*=nums[i];
            ans=Math.max(prod,ans);
            if(prod==0) prod=1;
        }
        prod=1;
        for(int i=n-1;i>=0;i--){
            prod*=nums[i];
            ans=Math.max(prod,ans);
            if(prod==0) prod=1;
        }
        return ans;
    }
}