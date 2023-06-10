import java.util.Scanner;

public class n_array {
    public static void main(String[] args) {
        int arr[] = new int['n'];
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choose of number");
        n = sc.nextInt();
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i =0 ;i<n; i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
        System.out.println("Sorted array:-");
        for(int i =0;i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
