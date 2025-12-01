import java.util.*;
public class Maximum_Running_Time_Of_N_Computers {
    public long maxRunTime(int n, int[] arr) {
        Arrays.sort(arr);
        long total=0;
        for(int x:arr)total+=x;
        // Remove largest batteries that are too big to contribute fairly
        for(int i=arr.length-1;i>=0;i--){
            long val=total/n;
            if(arr[i]<=val)break;
            total-=arr[i];
            n--;
        }
        return total/n;
        //TC->O(NlogN) due to sorting.
        //SC->O(1).
    }
}
