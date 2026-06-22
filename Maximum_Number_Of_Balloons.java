public class Maximum_Number_Of_Balloons {
    public int maxNumberOfBalloons(String text){
        //We have to return the minimum frequency word count among all the characters that appears in the string.
        //Count character frequencies.Find how many times "balloon" can be formed : min(b, a, l/2, o/2, n).
        int[]freq=new int[26];
        for(char ch:text.toCharArray())freq[ch-'a']++;
        return Math.min(Math.min(freq['b'-'a'],freq['a'-'a']),Math.min(Math.min(freq['l'-'a']/2,freq['o'-'a']/2),freq['n'-'a']));
        //Time complexity: O(n), where n is the length of the input string text.
        //Space complexity: O(1), as the size of the frequency array is constant (
    }
}
