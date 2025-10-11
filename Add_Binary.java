import java.math.BigInteger;
public class Add_Binary {
    public String addBinary(String a, String b) {
        BigInteger n = new BigInteger(a, 2);  // binary string to BigInteger
        BigInteger m = new BigInteger(b, 2);  // binary string to BigInteger
        BigInteger sum = n.add(m);            // add the two numbers
        return sum.toString(2);               // convert back to binary string
    }
}
