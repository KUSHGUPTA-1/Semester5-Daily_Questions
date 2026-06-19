class Find_The_Highest_Altitude{
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int arr[]=new int[n+1];
        arr[0]=0;
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+gain[i-1];
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
        // Time Complexity: O(n), where n is the length of the gain array. We iterate through the gain array once to calculate the altitudes and once to find the maximum altitude.
        // Space Complexity: O(n), as we are using an additional array to store the alt
    }
}