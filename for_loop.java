import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter ur number");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(n +"X"+i+"="+(n*i));
            i=i+1;
        }
    }    
}
