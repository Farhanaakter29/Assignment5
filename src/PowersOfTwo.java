//E-6.12
public class PowersOfTwo {
    public static void main(String[] args) {
        int exponent = 0;
        while (exponent <= 20) {
            long result = (long) Math.pow(2, exponent);
            System.out.println("2^" + exponent + " = " + result);
            exponent++;
        }
    }
}
