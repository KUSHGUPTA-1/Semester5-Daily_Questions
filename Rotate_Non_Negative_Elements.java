public class Rotate_Non_Negative_Elements {
    public int[] rotateElements(int[] nums, int k) {
        int n=nums.length;
        int c=0;
        for(int num:nums){
            if(num>=0){
                c++;
            }
        }
        if(c==0){
            return nums;
        }
        int idx=0;
        int arr[]=new int[c];
        for(int num:nums){
            if(num>=0){
                arr[idx++]=num;
            }
        }
        k=k%c;
        rotate(arr,0,k-1);
        rotate(arr,k,c-1);
        rotate(arr,0,c-1);
        idx=0;
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                nums[i]=arr[idx++];
            }
        }
        return nums;
    }
    public void rotate(int nums[],int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        //TC->O(N).
        //SC->O(1).
    }
}
