public class Total_Waviness_Of_Numbers_In_Range_1 {
    public int totalWaviness(int num1, int num2) {
        int t=0;
        for(int j=num1;j<=num2;j++){
            String s=String.valueOf(j);
            if(s.length()<3){
                continue;
            }
            for(int i=1;i<s.length()-1;i++){
                char l=s.charAt(i-1);
                char mid=s.charAt(i);
                char r=s.charAt(i+1);
                if(mid>l && mid>r){
                    t++;
                }
                else if(mid<l && mid<r){
                    t++;
                }
            }
        }
        return t;
    }
}
