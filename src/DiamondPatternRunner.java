//E-6.18(half 2)
import java.util.Scanner;
public class DiamondPatternRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the diamond: ");
        int sideLength = scanner.nextInt();

        // Display the filled diamond
        DiamondPattern  diamondPattern= new  DiamondPattern();
        DiamondPattern.displayFilledDiamond(sideLength);
        scanner.close();
    }
}
