public class constant {
    public static void main(String[] args) {
        final int a=10;
        final int b=10;
        a=20;
        System.out.println("I'm Try to change the value of constant(which will be going to throw an error) : "+a);
        System.out.println("Constant value: "+b);
    }
}
