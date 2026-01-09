public class Rectangle_Area {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2){
        //A rectilinear rectangle (also called an axis-aligned rectangle) has: 
        //Horizontal sides parallel to the X-axis 
        //Vertical sides parallel to the Y-axis 
        //No rotation 
        int areaA=(ax2-ax1)*(ay2-ay1);
        int areaB=(bx2-bx1)*(by2-by1);
        int overlapx=Math.min(ax2,bx2)-Math.max(ax1,bx1);
        int overlapy=Math.min(ay2,by2)-Math.max(ay1,by1);
        int overlap=0;
        if(overlapx>0 && overlapy>0){
            overlap=overlapx*overlapy;
        }
        return areaA+areaB-overlap;
        //TC-> O(1)
        //SC-> O(1)
    }
}
