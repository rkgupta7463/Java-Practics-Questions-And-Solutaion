import java.util.Scanner;

public class ternaryopt {
    public static void main(String[] args) {
        int age;
        long aad;
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("Verification of register addar number!");
        System.out.println("Enter ur name");
        name=sc.nextLine();
        System.out.println("Enter ur age");
        age=sc.nextInt();
        System.out.println("Enter ur addar no.");
        aad=sc.nextLong();
        String rs=(age > 18 & age < 100) ? "Eligible":"Not Eligible";
        
        System.out.println(rs);
        
    }
    
}
