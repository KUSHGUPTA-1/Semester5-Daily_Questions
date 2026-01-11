class Last_Moment_Before_All_Ants_Fall_Out_Of_A_Plank {
    public int getLastMoment(int n, int[] left, int[] right){
        // return n;
        int t=0;
        for(int num:left){
            t=Math.max(t,num);
        }
        for(int num:right){
            t=Math.max(t,n-num);
        }
        return t;
        //TC:O(m) m=left.length+right.length
        //SC:O(1)
    }
}