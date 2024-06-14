import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class String4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scanner.nextLine();

        List<String> substrings = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                substrings.add(word.substring(i, j));
            }
        }

        Collections.sort(substrings, Comparator.comparingInt(String::length));

        for (String substring : substrings) {
            System.out.println(substring);
        }

        scanner.close();
    }
}
