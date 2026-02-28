class Goal_Parser_Interpretation {
    public String interpret(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='G'){
                sb.append('G');
            }
            if(s.charAt(i)=='('){
                if(s.charAt(i+1)==')'){
                    sb.append('o');
                    i++;
                }
                else{
                sb.append("al");
                i=i+3;
                }
            }
        }
        return sb.toString();
        //TC->O(N).
        //SC->O(N).
    }
}