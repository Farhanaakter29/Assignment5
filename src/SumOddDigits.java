//E-6.1(e)
import java.util.Scanner;
public class SumOddDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = scanner.next();
        int sum = 0;
        for (char digit : num.toCharArray()) {
            int d = Character.getNumericValue(digit);
            if (d % 2 != 0) {
                sum += d;
            }
        }
        System.out.println("Sum of all odd digits of " + num + ": " + sum);
    }
}

