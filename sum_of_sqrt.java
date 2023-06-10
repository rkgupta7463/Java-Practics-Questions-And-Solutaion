import java.util.Scanner;

public class sum_of_sqrt {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        int rs=0;
        for (int i = 1; i <= n; i++) {
            rs += i * i;
        }
        System.out.println("Sum of square N number: " + rs);
    }
}
