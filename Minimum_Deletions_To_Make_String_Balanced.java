public class Minimum_Deletions_To_Make_String_Balanced{
    public int minimumDeletions(String s){
        int cb=0;
        int del=0;
        for(char ch:s.toCharArray()){
            if(ch=='b'){
                cb++;
            }
            else if(ch=='a'){
                if(cb>0){
                    del++;
                    cb--;
                }
            }
        }
        return del;
        //TC->O(N).
        //SC->O(1).
    }
}
