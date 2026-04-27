class Categorise_Box_According_To_Criteria {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean heavy=false;
        if(mass>=100){
            heavy=true;
        }
        boolean bulky=false;
        long volume=1L*length*width*height;
        if(length>=10000 || width>=10000 || height>=10000 || volume>=1000000000){
            bulky=true;
        }
        if(bulky && heavy) return "Both";
        else if(!bulky && !heavy) return "Neither";
        else if(bulky && !heavy) return "Bulky";
        else return "Heavy";
        //TC->O(1).
        //SC->O(1).
    }
}