public class Find_Smallest_Letter_Greater_Than_Target {
    public char nextGreatestLetter(char[] letters, char target) {
        int left=0;
        int right=letters.length-1;
        char temp=letters[0];
        while(left<=right){
            int mid=left+(right-left)/2;
            if(letters[mid]>target){
                temp=letters[mid];
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return temp;
        //TC->O(log N).
        //SC->O(1).
    }
}
