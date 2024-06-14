
import java.util.Scanner;
public class Streing2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scanner.nextLine();
        StringBuilder reversedWord = new StringBuilder(word);

        reversedWord.reverse();
        System.out.println("Reversed word: " + reversedWord.toString());

        scanner.close();
    }
}
