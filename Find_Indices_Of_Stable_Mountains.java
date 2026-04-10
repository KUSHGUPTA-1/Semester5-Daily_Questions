import java.util.*;
public class Find_Indices_Of_Stable_Mountains {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<height.length;i++){
            if(height[i-1]>threshold){
                ans.add(i);
            }
        }
        return ans;
        //TC->O(N).
        //SC->O(N) for the answer list.
    }
}
