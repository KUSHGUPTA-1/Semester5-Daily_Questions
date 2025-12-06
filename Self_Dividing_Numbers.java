import java.util.*;
public class Self_Dividing_Numbers {
    public List<Integer> selfDividingNumbers(int left, int right){
        List<Integer>l1=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isSelfDividing(i)){
                l1.add(i);
            }
        }
        return l1;
    }
    public boolean isSelfDividing(int num){
        int temp=num;
        while(temp!=0){
            int r=temp%10;
            if(r==0 || num%r!=0){
                return false;
            }
            temp=temp/10;
        }
        return true;
    }
    //time complexity is O(n*k) where n is the number of elements between left and right and k is the number of digits in the number
    //space complexity is O(1)
}
