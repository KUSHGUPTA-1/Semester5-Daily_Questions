public class Minimum_Moves_To_Reach_Target_Score {
    public int minMoves(int target, int maxDoubles) {
        int ans=0;
        while(target>1){
            if(maxDoubles==0){
                ans+=target-1;
                break;
            }
            if(target%2==0){
                target/=2;
                maxDoubles--;
            }
            else{
                target--;
            }
            ans++;
        }
        return ans;
        //Time Complexity: O(log(target)), where target is the input integer. The while loop runs until target becomes 1, and in each iteration, we either divide target by 2 or decrement it by 1.
        //Space Complexity: O(1), as we are using a constant amount of extra space
    }
}
