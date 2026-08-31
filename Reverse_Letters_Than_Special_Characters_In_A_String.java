public class Reverse_Letters_Than_Special_Characters_In_A_String {
    public String reverseByType(String s){
        char arr[]=s.toCharArray();
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        for(char ch:arr){
            if(ch>='a' && ch<='z'){
                s1.append(ch);
            } 
            else{
                s2.append(ch);
            }
        }
        s1.reverse();
        s2.reverse();
        int li=0;
        int si=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>='a' && arr[i]<='z'){
                arr[i]=s1.charAt(li++);
            } 
            else{
                arr[i]=s2.charAt(si++);
            }
        }

        return new String(arr);
        // Time Complexity: O(n).
        // Space Complexity: O(n).
    }
}
