public class Count_Beautiful_Substrings1 {
    public int beautifulSubstrings(String s, int k) {
        int count=0; //Stores the count of Beautiful Substrings.
        for(int i=0;i<s.length();i++){
            int c=0; //Count of consonant.
            int v=0; //Count of vowel.
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){ //Checking if it is vowel.
                    v++; //update count of vowel.
                }
                else{ //Checking if it is a consonant.
                    c++; //update count of consonant.
                }
                if(v==c && (v*c)%k==0){ //Chcek the Beautiful Substring condition directly.
                    count++;
                }
            }
        }
        return count;
        //TC->O(N^2).
        //SC->O(1).
    }
}
