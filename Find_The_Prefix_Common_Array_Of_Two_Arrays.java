import java.util.*;
public class Find_The_Prefix_Common_Array_Of_Two_Arrays {
    public static void main(String[] args) {
        int A[]={1,2,3,4};
        int B[]={2,1,3,5};
        System.out.println(Arrays.toString(findThePrefixCommonArray(A, B)));
    }
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n1=A.length;
        int n2=B.length;
        int C[]=new int[n1];
        int freq[]=new int[n1+1]; //Frequency Array.
        int c=0; //Count of similar elements.
        for(int i=0;i<n1;i++){
            freq[A[i]]++;
            if(freq[A[i]]==2){
                c++;
            }
            freq[B[i]]++;
            if(freq[B[i]]==2){
                c++;
            }
            C[i]=c;
        }
        return C;
        //Time Complexity: O(n) where n is the length of the input arrays A and B.
        //Space Complexity: O(n) where n is the length of the input arrays A and
    }
}
