public class Two_Furthest_Houses_With_Different_Colors {
    public int maxDistance(int[] colors) {
        int len=colors.length;
        for(int i=0;i<len;i++){
            if(colors[i]!=colors[len-1] || colors[len-1-i]!=colors[0]){
                return len-1-i;
            }
        }
        return 0;
        // TC->O(n), 
        // SC->O(1)
    }
}
