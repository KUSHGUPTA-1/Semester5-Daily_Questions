import java.util.*;
class Max_Sum_Path_In_Two_Arrays {
    public int maxPathSum(List<Integer> arr1, List<Integer> arr2) {
        // code here
        int n=arr1.size();
        int m=arr2.size();
        int i=0;
        int j=0;
        int res=0;
        int sum1=0;
        int sum2=0;
        while(i<n && j<m){
            if(arr1.get(i)<arr2.get(j)){
                sum1+=arr1.get(i++);
            }
            else if(arr1.get(i)>arr2.get(j)){
                sum2+=arr2.get(j++);
            }
            else{
                res+=Math.max(sum1,sum2)+arr1.get(i);
                i++;
                j++;
                sum1=0;
                sum2=0;
            }
        }
        while(i<n){
            sum1+=arr1.get(i++);
        }
        while(j<m){
            sum2+=arr2.get(j++);
        }
        res+=Math.max(sum1,sum2);
        return res;
        //TC: O(n+m) where n and m are the sizes of arr1 and arr2 respectively, as we traverse both arrays once.
        //SC: O(1) as we are using only a constant amount of extra space for variables to keep track of sums and indices.
    }
}