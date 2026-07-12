public class Sum_Of_All_Odd_Length_Subarrays {
    public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int len=j-i+1;
                if(len%2!=0){
                    for(int k=i;k<=j;k++){
                        sum+=arr[k];
                    }
                }
            }
        }
        return sum;
        //TC->O(N^3).
        //SC->O(1).
    }
}
