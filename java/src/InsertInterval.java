package java.src;
import java.util.*;
public class InsertInterval {

    public int[][] insert(int intervals[][], int arr[]) {

        //case-0 - no interval present
        //case-1 - it overlaps one or more intervals
        //case-2 - no overlapping just fits between two intervals
        //case-3 - first and last interval
        if (intervals.length == 0) return new int[][]{arr};
        int start = arr[0];
        int end = arr[1];
        int i = 0;
        int n = intervals.length;
        List<int[]> ans = new ArrayList<>();
        while (i < n && intervals[i][1] < start) {
            ans.add(intervals[i++]);
        }
        while (i < n && intervals[i][0] <= end) {
            start = Math.min(start, intervals[i][0]);
            end = Math.max(end, intervals[i][1]);
            i++;
        }
        ans.add(new int[]{start, end});
        while (i < n) {
            ans.add(intervals[i]);
            i++;
        }
        return ans.toArray(new int[0][0]);

    }
}
