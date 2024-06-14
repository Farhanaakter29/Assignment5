import java.util.Scanner;
public class String3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scanner.nextLine().toLowerCase(); // Convert to lower case for simplicity
        int vowelCount = 0;

        String vowels = "aeiouy";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);

        scanner.close();
    }
}

