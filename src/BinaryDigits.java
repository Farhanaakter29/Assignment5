//E-6.13
import java.util.Scanner;
public class BinaryDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        while (number > 0) {
            int digit = number % 2;
            System.out.println(digit);
            number /= 2;
        }
        scanner.close();
    }
}
