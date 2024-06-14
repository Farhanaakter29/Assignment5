//E-6.17(half 2)
import java.util.*;
public class SquarePatternsRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        int sideLength = scanner.nextInt();

        // Display filled square
        System.out.println("Filled Square:");
        SquarePatterns squarePatterns=new SquarePatterns();
        SquarePatterns.displayFilledSquare(sideLength);

        // Display hollow square
        System.out.println("\nHollow Square:");
        SquarePatterns.displayHollowSquare(sideLength);
        scanner.close();
    }
}
