import java.util.*;
public class Remove_Covered_Intervals {
    public int removeCoveredIntervals(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals,(a,b)->{
            if(a[0]==b[0]) return (b[1]-a[1]);
            else return (a[0]-b[0]);
        });
        int prev=intervals[0][1];
        int cnt=0;
        for(int i=1;i<n;i++){
            int b=intervals[i][1];
            if(b<=prev){
                cnt++;
            }
            else{
                prev=b;
            }
        }
        return n-cnt;
        //Time Complexity: O(n log n)
        //Space Complexity: O(1) (excluding the sorting implementation's auxiliary space)
    }
}
