import java.util.Arrays;

public class Construct_Uniform_Parity_Array2 {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        int co=0;
        int ce=0;
        Arrays.sort(nums1);
        for(int i=0;i<n;i++){
            if(nums1[i]%2==0){
                ce++;
            }
            else{
                co++;
            }
        }
        if((co==n && ce==0) || (co==0 && ce==n)){
            return true;
        }
        else{
            int smallest=nums1[0];
            if(smallest%2==1){
                return true;
            }
        }
        return false;
        //TC-> O(nlogn). 
        //SC-> O(1).
    }
}
