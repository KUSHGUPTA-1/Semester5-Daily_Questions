import java.util.*;
public class Maximum_Product_Of_Two_Digits {
    public int maxProduct(int n) {
        int arr[]=new int[10];
        int i=0;
        while(n!=0){
            arr[i++]=n%10;
            n/=10;
        }
        Arrays.sort(arr);
        return arr[arr.length-1]*arr[arr.length-2];
        //TC: O(log(n)) + O(10log10) ~ O(log(n))
        //SC: O(1)
    }
}
