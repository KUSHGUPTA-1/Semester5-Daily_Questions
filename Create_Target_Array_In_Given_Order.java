import java.util.*;
class Create_Target_Array_In_Given_Order {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        int index[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            index[i]=sc.nextInt();
        }
        int ans[]=createTargetArray(nums,index);
        for(int i:ans){
            System.out.print(i+" ");
        }    
        sc.close();
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
        //It involves the concept of shifting in the array not overriding so we used ArrayList,Otherwise By making 2D Array Approach is also Correct.
        ArrayList<Integer> l1=new ArrayList<>();
        for(int i=0;i<n;i++){
            l1.add(index[i],nums[i]);
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=l1.get(i);
        }
        return ans;
        //TC->O(N^2).
        //SC->O(N).
    }
}