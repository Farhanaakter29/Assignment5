//E-6.2
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.println("Enter a series of numbers (separated by space):");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        // Initialize variables for smallest and largest
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        // Initialize counters for even and odd numbers
        int evenCount = 0;
        int oddCount = 0;

        // Initialize an array to hold the cumulative totals
        int[] cumulativeTotals = new int[numbers.length];
        int sum = 0;

        // Initialize a list to hold adjacent duplicates
        ArrayList<Integer> adjacentDuplicates = new ArrayList<>();

        // Process each number
        for (int i = 0; i < numbers.length; i++) {
            int num = Integer.parseInt(numbers[i]);

            // Find smallest and largest numbers
            if (num < smallest) {
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }

            // Check if the number is even or odd
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            // Calculate cumulative total
            sum += num;
            cumulativeTotals[i] = sum;

            // Check for adjacent duplicates
            if (i > 0 && num == Integer.parseInt(numbers[i - 1])) {
                if (adjacentDuplicates.isEmpty() || adjacentDuplicates.get(adjacentDuplicates.size() - 1) != num) {
                    adjacentDuplicates.add(num);
                }
            }
        }

        // Print the results
        System.out.println("Smallest input: " + smallest);
        System.out.println("Largest input: " + largest);
        System.out.println("Number of even inputs: " + evenCount);
        System.out.println("Number of odd inputs: " + oddCount);
        System.out.print("Cumulative totals: ");
        for (int total : cumulativeTotals) {
            System.out.print(total + " ");
        }
        System.out.println();
        System.out.print("Adjacent duplicates: ");
        for (int duplicate : adjacentDuplicates) {
            System.out.print(duplicate + " ");
        }
        System.out.println();
    }
}
