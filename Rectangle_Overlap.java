class Rectangle_Overlap{
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        //This can be solved by making a diagram and thinking what conditions make it not overlap.
        // x1>=x4 or y1>=y4.    (means rec1 is completely to right of rec2 or rec1 is above rec2)
        // x2<=x3 or x1>=x4.    (means rec1 is left of rec2 or rec1 left edge is right of rec2 right edge[impossible])  
        // y2<=y3 or y1>=y4.    (means rec1 is below rec2 or rec1 is above rec2)
        if(rec1[0]>=rec2[2] || rec1[1]>=rec2[3] || rec1[2]<=rec2[0] || rec1[0]>=rec2[3] || rec1[3]<=rec2[1] || rec1[1]>=rec2[3]){
            return false;
        }
        return true;
    }
}