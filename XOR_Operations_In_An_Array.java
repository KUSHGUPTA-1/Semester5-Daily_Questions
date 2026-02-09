public class XOR_Operations_In_An_Array {
    public static void main(String[] args) {
        int n=5;
        int start=0;
        System.out.println(xorOperation(n,start));
    }
    public static int xorOperation(int n,int start) {
        int nums[]=new int[n];
        int x=0;
        for(int i=0;i<n;i++){
            x^=start+2*i;
        }
        return x;
        //TC->O(N).
        //SC->O(1).
    }
}
