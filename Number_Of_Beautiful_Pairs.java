public class Number_Of_Beautiful_Pairs {
    public int countBeautifulPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int fdig=nums[i];
            while(fdig>9)fdig/=10;
            for(int j=i+1;j<nums.length;j++){
                int ldig=nums[j]%10;
                if(gcd(fdig,ldig)==1){
                    count++;
                }
            }
        }
        return count;
    }
    public int gcd(int a,int b){
        if(b==0){
            return a;
        } 
        return gcd(b,a%b);
    }
    //TC->O(n^2*log(max_digit))
    //SC->O(1)
}
