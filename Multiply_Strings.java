import java.math.BigInteger;
public class Multiply_Strings{
    public String multiply(String num1, String num2){
        BigInteger n1=new BigInteger(num1);
        BigInteger n2=new BigInteger(num2);
        return String.valueOf(n1.multiply(n2));
    }
}
