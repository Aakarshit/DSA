package java.src;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] arr) {
        int ans=0;
        int max=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            if(max<arr[i]){
                max=arr[i];
            }else{
                ans=Math.max(max-arr[i],ans);
            }
        }
        return ans;
    }
}
