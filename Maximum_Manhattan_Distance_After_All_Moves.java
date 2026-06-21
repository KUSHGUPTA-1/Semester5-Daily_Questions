public class Maximum_Manhattan_Distance_After_All_Moves {
    public int maxDistance(String moves){
        int x=0;
        int y=0;
        int k=0;
        for(char ch:moves.toCharArray()){
            if(ch=='U'){
                y++;
            }
            else if(ch=='D'){
                y--;
            }
            else if(ch=='L'){
                x++;
            }
            else if(ch=='R'){
                x--;
            }
            else{
                k++;
            }
        }
        int dist=Math.abs(x)+Math.abs(y)+k;
        return dist;
        // Time Complexity: O(n)
        // Space Complexity: O(1)
    }
}
