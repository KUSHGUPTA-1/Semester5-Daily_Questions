public class Count_The_Number_Of_Special_Characters2 {
    public int numberOfSpecialChars(String word) {
        int c=0;
        for(char ch='a';ch<='z';ch++){
            int lowerindex=word.lastIndexOf(ch);
            int upperindex=word.indexOf(Character.toUpperCase(ch));
            if(lowerindex !=-1 && upperindex!=-1 && lowerindex<upperindex){
                c++;
            }
        }
        return c;
        //TC:O(n) where n is the length of the string.
        //SC:O(1) as we are using only constant space.
    }
}
