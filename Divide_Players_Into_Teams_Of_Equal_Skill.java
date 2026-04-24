import java.util.*;
public class Divide_Players_Into_Teams_Of_Equal_Skill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int skill[]=new int[n];
        for(int i=0;i<n;i++){
            skill[i]=sc.nextInt();
        }
        System.out.println(dividePlayers(skill));
        sc.close();
    }
    public static long dividePlayers(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        long sum=0;
        int target=arr[0]+arr[n-1];
        for(int i=0;i<n/2;i++){
            if((arr[i]+arr[n-i-1])!=target){
                return -1;
            }
            else{
                sum+=(long)arr[i]*arr[n-i-1];
            }
        }
        return sum;
        //TC->O(N log N).
        //SC->O(1).
    }
}
