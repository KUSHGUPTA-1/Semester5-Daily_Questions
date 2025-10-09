public class Median_Of_Two_Sorted_Array {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //Brute Force Approach
        // int m=nums1.length;
        // int n=nums2.length;
        // int o=n+m;
        // int nums3[]=new int[o];
        // int i=0,j=0,k=0;
        // while(i<m){
        //     nums3[k++]=nums1[i++];
        // }
        // while(j<n){
        //     nums3[k++]=nums2[j++];
        // }
        // Arrays.sort(nums3);
        // if(nums3.length%2!=0){
        //     return (double)nums3[o/2];
        // }
        // else{
        //     //Agar odd length ka ho and left side mai jyada parts honge toh left side ka max element hi minimum hoga.
        //     int middle1=nums3[(o/2)-1];    
        //     int middle2=nums3[o/2];
        //     return ((double)middle1 + (double)middle2)/2.0;
        // }
        //TC-> O((m+n)log(m+n))
        //SC-> O(m+n) as extra array nums3.
        
        
        //Optimised Approach USing Binary Search.

        //Most Hardest Of Binary Search.Hamesha chote array pe Binary Search Lageyange.
        if(nums1.length>nums2.length){    //Array mai direct swapping is possible hai.
            int temp[]=nums1;
            nums1=nums2;
            nums2=temp;
        }
        //Applying Binary Search Logic.
        int lo=0;
        int hi=nums1.length;  //(length-1)tak isliye chalaya taki ham pure elements ko acquire kar paye.
        int total=(nums1.length+nums2.length);
        int hf=(total+1)/2;
        while(lo<=hi){
            int nums1l=(lo+hi)/2;    //nums1l=amid
            int nums2l=hf-nums1l;   //nums2l=bmid
            int nums1lml=(nums1l==0) ? Integer.MIN_VALUE:nums1[nums1l-1];  //nums1l-1 = nums1lml
            int nums1left=(nums1l==nums1.length) ? Integer.MAX_VALUE:nums1[nums1l]; //nums1l = nums1left
            int nums2lml=(nums2l==0) ? Integer.MIN_VALUE:nums2[nums2l-1];  //nums2l-1 = nums2lml
            int nums2left=(nums2l==nums2.length) ? Integer.MAX_VALUE:nums2[nums2l]; //nums2l = nums2left


            if(nums1lml<=nums2left && nums2lml<=nums1left){
                double ans;
                if(total%2==0){
                    ans=(Math.max(nums1lml,nums2lml)+Math.min(nums1left,nums2left))/2.0;
                }
                else{
                    ans=Math.max(nums1lml,nums2lml)/1.0;
                }
                return ans;
            }
            else if(nums1lml>nums2left){
                hi=nums1l-1;
            }
            else if(nums2lml>nums1left){
                lo=nums1l+1;
            }
        }
        return -1.0;
        //TC-> O(log(min(m,n)))
        //Sc-> O(1)
    }
}
