public class Find_The_Town_Judge {
    public int findJudge(int n, int[][] trust) {
        if(trust.length==0 && n==1) 
            return 1;
        int[] count=new int[n+1];
        for(int[] arr:trust){
            count[arr[0]]--;
            count[arr[1]]++;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]==n-1) return i;
        }
        return -1;
        //TC->O(m) where m is length of trust array
        //SC->O(n)
    }    
}
