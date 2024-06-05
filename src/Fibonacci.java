import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("Por favor, informe um número desejado na sequência Fibonacci: ");
        n = scanner.nextInt();

        fibonacciPiramide(n);
    }

    public static void fibonacciPiramide(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(fibonacci(j) + " ");
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(fibonacci(j) + " ");
            }
            System.out.println();
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
