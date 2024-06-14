//E-6.17(half 1)
import java.util.Scanner;
public class SquarePatterns {
    //filled square
    public static void displayFilledSquare(int sideLength) {
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                System.out.print("*");
            }
            System.out.print("  ");
            for (int j = 0; j < sideLength; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // hollow square
    public static void displayHollowSquare(int sideLength) {
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                if (i == 0 || i == sideLength - 1 || j == 0 || j == sideLength - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for (int j = 0; j < sideLength; j++) {
                if (i == 0 || i == sideLength - 1 || j == 0 || j == sideLength - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
