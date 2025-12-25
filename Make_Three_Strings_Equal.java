public class Make_Three_Strings_Equal {
    public int findMinimumOperations(String s1, String s2, String s3) {
        //phele vo string find kro jiski length sbse choti hai.
        int mins=Math.min(s1.length(),Math.min(s2.length(),s3.length()));
        int c=0;
        for(int i=0;i<mins;i++){
            //sb string mai character same hai toh count bda do.
            if((s1.charAt(i)==s2.charAt(i)) && (s2.charAt(i)==s3.charAt(i))){ 
                c++;
            }
            else{
                break;
            }
        }
        if(c==0){
            return -1;
        }
        return (s1.length()+s2.length()+s3.length())-3*c;
        //TC-> O(n)
        //SC-> O(1)
    }
}
