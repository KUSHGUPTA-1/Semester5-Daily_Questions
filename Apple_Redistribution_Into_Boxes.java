import java.util.*;
public class Apple_Redistribution_Into_Boxes {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum=0;
        for(int app:apple){
            sum+=app;
        }
        Arrays.sort(capacity);
        int box=0;
        for(int i=capacity.length-1;i>=0;i--){
            sum-=capacity[i];
            box++;
            if(sum<=0){
                return box;
            }
        }
        return box;
        //TC-> O(m log m).
        //SC-> O(1).
    }
}
