//E-6.19(half 1)
public class LikeDiamondPattern {
    public static void displayDiamondPattern(int sideLength) {
        // Upper half
        for (int i = 1; i <= sideLength; i++) {
            for (int j = 1; j <= sideLength - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = i - 1; j >= 1; j--) {
                if (j == 1 || j == i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Lower half
        for (int i = sideLength - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= sideLength - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = i - 1; j >= 1; j--) {
                if (j == 1 || j == i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
