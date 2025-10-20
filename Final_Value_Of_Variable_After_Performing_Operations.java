public class Final_Value_Of_Variable_After_Performing_Operations {
    public int finalValueAfterOperations(String[] operations) {
        int c=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("++X")){
                c++;
            }
            else if(operations[i].equals("X++")){
                c++;
            }
            else if(operations[i].equals("--X")){
                c--;
            }
            else{
                c--;
            }
        }
        return c;
        //TC->O(n)
        //SC->O(1)
    }
}
