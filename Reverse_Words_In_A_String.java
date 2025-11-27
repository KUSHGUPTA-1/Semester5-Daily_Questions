public class Reverse_Words_In_A_String {
    public String reverseWords(String s) {
        s=s.trim();
		System.out.println(s);
		String []arr=s.split("\s+");
//		System.out.println(Arrays.toString(arr));
		String ans="";
		for(int i=arr.length-1;i>=0;i--) {
			ans = ans+arr[i]+" ";
		}
		return ans.trim();
    }
}
