public class Container_With_Most_Water {
    public int maxArea(int[] height) {
        int max=0;
        int start=0;
        int end=height.length-1;
        while(start<end){
            int length=Math.min(height[start],height[end]);
            int area=(end-start)*length;
            max=Math.max(max,area);
            if(height[start]>height[end]){
                end--;
            }
            else{
                start++;
            }
        }
        return max;
        // Time Complexity: O(n)
        // Space Complexity: O(1)
    }
}
