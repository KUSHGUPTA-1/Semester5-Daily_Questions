class Earliest_Finish_Time_For_Land_And_Water_Rider1 {
    public int earliestFinishTime(int[] land, int[] water) {
        int n = land.length;
        int maxLandTime = 0;
        int maxWaterTime = 0;
        for (int i = 0; i < n; i++) {
            maxLandTime = Math.max(maxLandTime, land[i]);
            maxWaterTime = Math.max(maxWaterTime, water[i]);
        }
        return Math.max(maxLandTime, maxWaterTime);
        //SC->O(1)
        //TC->O(N)
    }
}