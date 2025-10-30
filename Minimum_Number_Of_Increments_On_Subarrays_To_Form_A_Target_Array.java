public class Minimum_Number_Of_Increments_On_Subarrays_To_Form_A_Target_Array {
    public int minNumberOperations(int[] target) {
        int n=target.length;
        int ans=target[0];
        //Hame bs tbhi increment krna hai jab hamara target[i]>target[i-1] se. varna koi increment nhi krna hai.
        for(int i=1;i<n;i++){
            ans+=Math.max(target[i]-target[i-1],0);
        }
        return ans;
        //TC->O(n)
        //SC->O(1)
    }
}
