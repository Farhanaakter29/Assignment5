//E-6.1(a)
public class SumEvenNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println("Sum of all even numbers between 2 and 100: " + sum);
    }
}
