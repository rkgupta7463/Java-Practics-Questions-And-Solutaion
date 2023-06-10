import java.util.Scanner;

public class fact_do_while {
    public static void main(String[] args) {
        int n;
        long fact = 1;
        System.out.println("Enter the a number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int i = 1;
        do {
            fact *= i;
            i++;
        } while (i <= n);

        if (n == 0) {
            System.out.println("Factorial of " + n + " is " + 0);

        } else {
            System.out.println("Factorial of " + n + " is " + fact);
        }
    }
}