import java.util.Scanner;

public class metrix_2d {
    public static void main(String[] args) {
        int m1[][] = new int[3][3];
        int m2[][] = new int[3][3];
        int result1[][]=new int[3][3];
        int result2[][]=new int[3][3];
        int result3[][]=new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of metrix 1st");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1.length; j++) {
                m1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of 2nd metrix");
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2.length; j++) {
                m2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1st:");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1.length; j++) {
                System.out.print(m1[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Matrix 2nd:");
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2.length; j++) {
                System.out.print(m2[i][j] + " ");
            }
            System.out.println("");
        }

        for(int i=0; i<m1.length; i++){
            for(int j=0;j<m1.length; j++){
                result1[i][j]=m1[i][j]+m2[i][j];
            }
        }
        System.out.println("Sum of Matrixs:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result1[i][j]+ " ");
            }
            System.out.println("");
        }

        for(int i=0; i<m1.length; i++){
            for(int j=0;j<m1.length; j++){
                result2[i][j]=m1[i][j]*m2[i][j];
            }
        }
        System.out.println("Mux of Matrixs:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result2[i][j]=0;      
            for(int k=0;k<3;k++)      
            {      
                result2[i][j]+=m1[i][k]*m2[k][j];    
            }  

                System.out.print(result2[i][j]+ " ");
            }
            System.out.println("");
        }
        System.out.println("Inverse of matrix's 1st");
        for(int i=0; i<m1.length; i++){
            for(int j=0;j<m1.length; j++){
                System.out.print(m1[j][i]+" ");
            }
            System.out.println("");
        }
        System.out.println("Inverse of matrix's 2nd");
        for(int i=0; i<m2.length; i++){
            for(int j=0;j<m2.length; j++){
                System.out.print(m2[j][i]+" ");
            }
            System.out.println("");
        }
    }
}
