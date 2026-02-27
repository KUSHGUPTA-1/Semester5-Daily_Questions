import java.util.*;
public class Most_Frequent_Even_Element {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            if(num%2==0){
                map.put(num,map.getOrDefault(num,0)+1);
            }
        }
        int maxf=0;
        int result=-1;
        for(int key:map.keySet()){
            int freq=map.get(key);
            if(freq>maxf){
                maxf=freq;
                result=key;
            }
            else if(freq==maxf && key<result){
                result=key;
            }
        }
        return result;
        //TC:O(n).
        //SC:O(n).
    }
}
