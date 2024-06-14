//E-6.20(half 1)
import java.util.Scanner;
public class XShapePattern {
    public static void displayXShapePattern(int sideLength) {
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                if (i == j || i + j == sideLength - 1 || i == 0 || i == sideLength - 1 || j == 0 || j == sideLength - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
