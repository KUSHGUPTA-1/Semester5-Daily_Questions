public class Binary_Prefix_Divisible_By_5 {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> l1=new ArrayList<>();
        int val=0;
        for(int n:nums){
            val=((val*2)+n)%5;
            l1.add(val==0);
        }
        return l1;
        //TC->O(N).
        //SC->O(N).
    }
}
