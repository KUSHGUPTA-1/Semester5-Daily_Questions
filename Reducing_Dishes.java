import java.util.Arrays;

public class Reducing_Dishes {
    public int maxSatisfaction(int[] satisfaction) {
        int n=satisfaction.length;
        Arrays.sort(satisfaction);
        int sum=0;
        int total=0;
        int ans=0;
        //Start from last as positive dish cooks later,as it gives large multiplier.
        for(int i=n-1;i>=0;i--){
            sum+=satisfaction[i];
            total+=sum;
            ans=Math.max(ans,total);
        }
        return ans;
        //TC->O(N log N).
        //SC->O(1).
    }
}
