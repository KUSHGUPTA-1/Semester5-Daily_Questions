public class Maximum_69_Number {
    public int maximum69Number (int num) {
        String s=String.valueOf(num);
        s=s.replaceFirst("6","9");  //Replacing only first occurrence of 6.
        return Integer.parseInt(s);
    }
}
