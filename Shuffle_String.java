public class Shuffle_String {
    public String restoreString(String s, int[] indices) {
        char ch[]=new char[indices.length];
        for(int i=0;i<ch.length;i++){
            ch[indices[i]]=s.charAt(i);
        }
        return new String(ch); 
    }
}
