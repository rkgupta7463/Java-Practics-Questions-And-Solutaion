import java.util.Scanner;

public class alldtype {
    public static void main(String[] args) {
        int id;
        String name;
        char gender;
        float height;
        boolean status;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input of all dtype");
        System.out.println("Enter ur name");
        name=sc.nextLine();
        System.out.println("Enter ur id");
        id=sc.nextInt();
        System.out.println("Enter ur height");
        height=sc.nextFloat();
        System.out.println("Enter ur status");
        status=sc.nextBoolean();
        System.out.println("Enter ur gender");
        gender=sc.next().charAt(0);
        System.out.print("Id: "+id+" Name: "+name+" gender: "+gender+" height: "+height+" status :"+status);
    }    
}
