class Check_If_Binary_String_Has_Atmost_One_Segment_Of_Ones {
    public boolean checkOnesSegment(String s) {
        return !s.contains("01");
        //TC->O(N).
        //SC->O(1).
    }
}