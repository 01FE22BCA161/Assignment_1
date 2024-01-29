import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting range: ");
        int startRange = scanner.nextInt();

        System.out.print("Enter the ending range: ");
        int endRange = scanner.nextInt();

        System.out.println("Prime numbers between " + startRange + " and " + endRange + ":");
        printPrimeNumbersInRange(startRange, endRange);

        scanner.close();
    }

    static void printPrimeNumbersInRange(int start, int end) {
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
