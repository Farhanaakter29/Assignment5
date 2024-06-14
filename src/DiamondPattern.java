//E-6.18(half 1)
import java.util.Scanner;
public class DiamondPattern {
    public static void displayFilledDiamond(int sideLength) {
        //upper half
        for (int i = 1; i <= sideLength; i++) {
            for (int j = 1; j <= sideLength - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //  lower half
        for (int i = sideLength - 1; i >= 1; i--) {
            for (int j = 1; j <= sideLength - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
