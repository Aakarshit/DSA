package java.src;

import java.util.*;
public class MergeIntervals {

        public int[][] merge(int[][] intervals) {
            if(intervals.length==1) return intervals;
            Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
            List<int[]> ans=new ArrayList<>();
            for(int i=0;i<intervals.length;i++){
                int s=intervals[i][0];
                int e=intervals[i][1];
                while(i+1<intervals.length && e>=intervals[i+1][0]){
                    e=Math.max(e,intervals[i+1][1]);
                    i++;
                }
                ans.add(new int[]{s,e});
            }
            return ans.toArray(new int [0][0]);
        }
    }

