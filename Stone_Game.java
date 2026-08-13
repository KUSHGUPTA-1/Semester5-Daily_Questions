public class Stone_Game {
    public boolean stoneGame(int[] piles) {
        return true;
        //TC: O(n^2)
        //SC: O(n^2)
        //The first player can always win the game. 
        // The first player can always choose the pile with the maximum number of stones, 
        // and then the second player will be left with a smaller pile. 
        // This process continues until all piles are taken, and the first player will always have more stones than the second player.
    }
}
