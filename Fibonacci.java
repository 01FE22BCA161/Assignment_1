import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = scanner.nextInt();
        
        System.out.println("Fibonacci Series:");
        printFibonacciSeries(n);
        
        scanner.close();
    }

    static void printFibonacciSeries(int n) {
        int firstTerm = 0, secondTerm = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
