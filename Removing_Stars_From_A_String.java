public class Removing_Stars_From_A_String {
    public String removeStars(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='*'){
                if(sb.length()>0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
        //Time Complexity: O(n), where n is the length of the input string s. We iterate through each character of the string once.
        //Space Complexity: O(n), where n is the length of the input string s.
    }
}
