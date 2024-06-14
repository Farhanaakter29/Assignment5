//E-6.20(half 2)
import java.util.*;
public class XShapePatternRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the box: ");
        int sideLength = scanner.nextInt();

        // Display the X shape pattern
        XShapePattern  xShapePattern=new  XShapePattern();
        XShapePattern.displayXShapePattern(sideLength);
        scanner.close();
    }
}
