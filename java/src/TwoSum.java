package java.src;
import java.util.*;
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<n;i++){
            int rem=target-nums[i];
            if(map.containsKey(rem) && map.get(rem)!=i){
                return new int[]{map.get(rem),i};
            }
        }
        return null;
    }
}
