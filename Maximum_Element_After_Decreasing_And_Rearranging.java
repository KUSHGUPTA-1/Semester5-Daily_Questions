import java.util.*;
public class Maximum_Element_After_Decreasing_And_Rearranging {
    public int maximumElementAfterDecrementingAndRearranging(int[] A) {
        Arrays.sort(A);
        int n = A.length;
        A[0] = 1;
        for (int i = 1; i < n; i++)
            A[i] = Math.min(A[i], A[i - 1] + 1);
        
        return A[n - 1];
        //Time Complexity: O(nlogn), where n is the length of the input array A. The sorting operation takes O(nlogn) time, and the subsequent loop runs in O(n) time.
        //Space Complexity: O(1), as we are modifying the input array A in place.
    }
}
