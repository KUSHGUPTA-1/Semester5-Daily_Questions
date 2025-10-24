public class Next_Greater_Numerically_Balanced_Number {
    public int nextBeautifulNumber(int n) {
        int num=n+1;
        while(true){
            if(isBeautiful(num)){
                return num;
            }
            num++;
        }
    }
    public boolean isBeautiful(int num){
        int count[]=new int[10];
        int temp=num;
        while(temp>0){
            count[temp%10]++;
            temp/=10;
        }
        for(int i=0;i<10;i++){
            if(count[i]!=0 && count[i]!=i){
                return false;
            }
        }
        return true;
        //TC->O(m-n)
        //SC->O(1)
    }
}
