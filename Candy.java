public class Candy {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int sum=0;
        int candies[]=new int[n];
        Arrays.fill(candies,1);   //fill candies array initially with 1.
        for(int i=1;i<n;i++){    //first position not have left neighbour.
            if(ratings[i-1]<ratings[i]){
                candies[i]=candies[i-1]+1;
            }
        }
        for(int i=n-2;i>=0;i--){  //last position not have right neighbour.
            if(ratings[i]>ratings[i+1]){
                candies[i]=Math.max(candies[i],candies[i+1]+1);
            }
        }
        for(int i=0;i<candies.length;i++){
            sum+=candies[i];      //sum of candies in array.
        }
        return sum;
    }
}
