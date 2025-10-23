import java.util.Scanner;
public class Check_If_Digits_Are_Equal_In_String {
    public boolean hasSameDigits(String s) {
        char a[]=s.toCharArray();
        while(a.length>2){
            char arr[]=new char[a.length-1];
            for(int i=0;i<a.length-1;i++){
                int b=((a[i]-'0') + (a[i+1]-'0'))%10;
                arr[i]=(char)(b + '0');
            }
            a=arr;
        }
        return a[0]==a[1];
    }
    public static void main(String[] args){
        Solution sol=new Solution();
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(sol.hasSameDigits(s));
    }
}
