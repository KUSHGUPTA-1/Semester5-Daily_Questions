class Task_Scheduler {
    public int leastInterval(char[] tasks, int n){
        int freq[]=new int[26];
        for(char c:tasks){
            freq[c-'A']++;
        }
        int maxf=0;
        for(int num:freq){
            if(num>maxf) maxf=num;
        }
        int c=0;
        for(int ele:freq){
            if(ele==maxf){
                c++;
            }
        }
        return Math.max(tasks.length,((maxf-1)*(n+1)+c));
        //Time complexity is O(n) where n is the number of tasks.
        //Space complexity is O(1) as we are using only a constant amount of space
    }
}