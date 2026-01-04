public class Maximum_Repeating_Substring {
    public int maxRepeating(String sequence, String word) {
        int count=0;
        String s=word;
        while(sequence.contains(s)){
            count++;
            s=s+word;
        }
        return count;
        //TC->O(n)
        //SC->O(1)
    }
}
