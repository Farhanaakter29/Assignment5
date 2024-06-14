//E-6.19(half 2)
import java.util.*;
public class LikeDiamondPatternRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of each part of the diamond: ");
        int sideLength = scanner.nextInt();
        // display the modifoed diamond
        LikeDiamondPattern  likeDiamondPattern=new  LikeDiamondPattern();
        LikeDiamondPattern.displayDiamondPattern(sideLength);
        scanner.close();
    }
}
