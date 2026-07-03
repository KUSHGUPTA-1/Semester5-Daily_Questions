public class Car_Pooling {
    public boolean carPooling(int[][] trips, int capacity) {
        int diff[]=new int[1001];
        int tp=0;
        for(int i=0;i<trips.length;i++){
            int passenger=trips[i][0];
            int from=trips[i][1];
            int to=trips[i][2];
            diff[from]+=passenger;
            diff[to]-=passenger;
        }
        for(int i=0;i<1001;i++){
            tp+=diff[i];
            if(tp>capacity){
                return false;
            }
        }
        return true;
        // Time Complexity: O(n) where n is the number of trips.
        // Space Complexity: O(1) as we are using a fixed size array of 1001.
    }
}
