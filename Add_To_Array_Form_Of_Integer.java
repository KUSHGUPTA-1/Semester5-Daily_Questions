import java.util.*;
public class Add_To_Array_Form_Of_Integer {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> l1=new ArrayList<>();
        int i=num.length-1;
        while(i>=0 || k>0){
            if(i>=0){
               k+=num[i];
               i--; 
            }
            l1.add(0,k%10);
            k/=10;
        }
        return l1;
        //TC:O(max(n,log(k)))
        //SC:O(max(n,log(k)))
    }
}
