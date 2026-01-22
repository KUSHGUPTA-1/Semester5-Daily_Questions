import java.util.*;
public class Minimum_Pair_Removal_To_Sort_Array {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> l1=new ArrayList<>();
        for(int num:nums){
            l1.add(num);
        }
        int c=0;  //Count of operations.
        int idx=0;
        // If the array is non-decreasing
        while(!isnond(l1)){ 
            int min=Integer.MAX_VALUE;
            //finding the leftmost pair with the minimum sum.
            for(int i=0;i<l1.size()-1;i++){
                int sum=l1.get(i)+l1.get(i+1);
                if(sum<min){
                    min=sum;
                    idx=i;
                }
            }
            //We merge the selected pair.
            int merge=l1.get(idx)+l1.get(idx+1);
            l1.remove(idx);
            l1.set(idx,merge);
            c++;
        }
        return c;
    }
    // Checking if the array is non-decreasing.(Means Increasing).
    public boolean isnond(List<Integer> l1){
        for(int i=1;i<l1.size();i++){
            if(l1.get(i)<l1.get(i-1)){
                return false;
            }
        }
        return true;
    }
    //TC->O(N^3).
    //SC->O(N).
}
