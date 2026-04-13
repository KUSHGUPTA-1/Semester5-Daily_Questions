class Best_Poker_Hand {
    public String bestHand(int[] ranks, char[] suits) {
        boolean flush = true;
        for (int i = 1; i < suits.length; i++) {
            if (suits[i] != suits[0]) {
                flush = false;
                break;
            }
        }
        if (flush) {
            return "Flush";
        }
        int[] count = new int[14];
        for (int rank : ranks) {
            count[rank]++;
        }
        int maxCount = 0;
        for (int c : count) {
            maxCount = Math.max(maxCount, c);
        }
        if (maxCount >= 3) {
            return "Three of a Kind";
        } else if (maxCount == 2) {
            return "Pair";
        } else {
            return "High Card";
        }
        //TC->O(N).
        //SC->O(1).

        // int n=ranks.length;
        // Object arr[][]=new Object[n][2];
        // for(int i=0;i<n;i++){
        //     arr[i][0]=ranks[i];
        //     arr[i][1]=suits[i];
        // }
        // boolean flush=true;
        // for(int i=1;i<n;i++){
        //     if((char)arr[i][1]!=(char)arr[0][1]){
        //         flush=false;
        //         break;
        //     }
        // }
        // if(flush){
        //     return "Flush";
        // }
        // int freq[]=new int[14]; //At max it can hold upto 13.
        // for(int i=0;i<n;i++){
        //     int r=(int)arr[i][0];
        //     freq[r]++;
        // }
        // boolean pair=false;
        // for(int i=0;i<freq.length;i++){
        //     if(freq[i]>=3){
        //         return "Three of a Kind";
        //     }
        //     if(freq[i]==2){
        //         pair=true;
        //     }
        // }
        // if(pair) return "Pair";
        // return "High Card";
        //TC->O(N).
        //SC->O(N) due to 2D Array.
    }
}