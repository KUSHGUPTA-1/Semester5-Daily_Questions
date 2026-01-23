public class Bitwise_XOR_Of_All_Pairings {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int xor1=Bitwisexor(nums1);
        int xor2=Bitwisexor(nums2);
        if(n%2==0 && m%2==0) return 0;  //Every number appears even times → everything cancels out as xor become 0.
        if(n%2==1 && m%2==1){ //If both array lengths are odd,both arrays contribute to final XOR.
            return xor1^xor2;
        }
        //nums1 elements repeat even times cancel out.,Only nums2 survives.
        else if(n%2==1){ //Odd wale array ka even pair hoga ,inka xor 0 hoga. 
            return xor2; //Isliye yha se even wala return kra hai kyuki inka.
        }
        //nums2 elements repeat even times cancel out.,Only nums1 survives.
        else{
            return xor1;
        }
    }
    public int Bitwisexor(int arr[]){
        int xor=0;
        for(int num:arr){ //Calculating  xor of the array.
            xor^=num;
        }
        return xor;
        //TC->O(N+M).
        //SC->O(1).
    }
}
