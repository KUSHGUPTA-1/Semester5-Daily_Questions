import java.util.*;
public class Frequency_Balance_Subarray {
    public int getLength(int[] nums) {
        int n=nums.length;
        int ans=1;
        for(int i=0;i<n;i++){
            HashMap<Integer,Integer> f=new HashMap<>();
            HashMap<Integer,Integer> fc=new HashMap<>();
            int mf=0;
            for(int j=i;j<n;j++){
                int x=nums[j];
                int old=f.getOrDefault(x,0);
                if(old>0){
                    int c=fc.get(old);
                    if(c==1) fc.remove(old);
                    else fc.put(old,c-1);
                }
                int now=old+1;
                f.put(x,now);
                fc.put(now,fc.getOrDefault(now,0)+1);
                int len=j-i+1;
                if(len==1){
                    ans=Math.max(ans,1);
                    continue;
                }
                if(f.size()==1){
                    ans=Math.max(ans,len);
                    continue;
                }
                if(fc.size()!=2) continue;
                int freq[]=new int[2];
                int ce[]=new int[2];
                int idx=0;
                for(var e:fc.entrySet()){
                    freq[idx]=e.getKey();
                    ce[idx]=e.getValue();
                    idx++;
                }
                int low=Math.min(freq[0],freq[1]);
                int hi=Math.max(freq[0],freq[1]);
                if(hi==2*low){
                    ans=Math.max(ans,len);
                }
            }
        }
        return ans;
        //TC-> O(n^2) for the nested loops, O(1) for HashMap operations, overall O(n^2).
        //SC-> O(n) for the HashMaps in the worst case.
    }
}
