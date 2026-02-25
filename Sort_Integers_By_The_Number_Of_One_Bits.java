import java.util.*;
public class Sort_Integers_By_The_Number_Of_One_Bits {
    public int[] sortByBits(int[] arr) {
        int n=arr.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=Integer.bitCount(arr[i])*10001+arr[i];
        }
        Arrays.sort(ans);
        for(int i=0;i<n;i++){
            ans[i]=ans[i]%10001;
        }
        return ans;
        //TC->O(N log N).
        //SC->O(1).
    }
}
