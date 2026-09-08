class Count_Commas_In_Range{
    public int countCommas(int n) {
        if(n<1000){
            return 0;
        }
        else{
            return n-999;
        }
        //TC->O(1).
        //SC->O(1).
    }
}