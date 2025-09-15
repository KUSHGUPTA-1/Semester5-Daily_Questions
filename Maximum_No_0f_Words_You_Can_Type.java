class Solution{
    public int canBeTypedWords(String text, String brokenLetters) {
        String nums[]=text.split(" ");
        int c=0;
        for(String word:nums){
            boolean canType=true;
            for(char ch:brokenLetters.toCharArray()){
                if(word.indexOf(ch)!=-1){
                    canType=false;
                    break;
                }
            }
            if(canType){
                c++;
            }
        }
        return c;
    }
}