//E-6.3
import java.util.ArrayList;
import java.util.Scanner;

public class StringProcessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Task a: Only uppercase letters
        StringBuilder uppercaseLetters = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                uppercaseLetters.append(c);
            }
        }
        System.out.println("Uppercase letters: " + uppercaseLetters.toString());

        // Task b: Every second letter
        StringBuilder everySecondLetter = new StringBuilder();
        for (int i = 1; i < input.length(); i += 2) {
            everySecondLetter.append(input.charAt(i));
        }
        System.out.println("Every second letter: " + everySecondLetter.toString());

        // Task c: String with vowels replaced by underscore
        String replacedVowels = input.replaceAll("[AEIOUaeiou]", "_");
        System.out.println("String with vowels replaced: " + replacedVowels);

        // Task d: Number of vowels
        int vowelCount = 0;
        String vowels = "AEIOUaeiou";
        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);

        // Task e: Positions of vowels
        ArrayList<Integer> vowelPositions = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            if (vowels.indexOf(input.charAt(i)) != -1) {
                vowelPositions.add(i);
            }
        }
        System.out.println("Positions of vowels: " + vowelPositions.toString());
    }
}
