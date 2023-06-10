import java.util.Scanner;

public class merge_sort {
    public void mergeso(int arr[], int lb, int ub, int mid) {
        int i, j, k;

        int n1 = mid - lb + 1;
        int n2 = ub - mid;

        int LeftArray[] = new int[n1];
        int RightArray[] = new int[n2];

        for (i = 0; i < n1; i++) {
            LeftArray[i] = arr[lb + i];
        }
        for (j = 0; j < n2; j++) {
            RightArray[j] = arr[mid + 1 + j];
        }
        i = 0; /* initial index of first sub-array */
        j = 0; /* initial index of second sub-array */
        k = lb; /* initial index of merged sub-array */

        while (i < n1 && j < n2) {
            if (LeftArray[i] <= RightArray[j]) {
                arr[k] = LeftArray[i];
                i++;
            } else {
                arr[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = RightArray[j];
            j++;
            k++;
        }
    }

    public void sort(int arr[], int lb, int ub) {

        int mid;
        if (lb < ub) {
            // Find the middle point
            mid = lb + (ub - lb) / 2;
 
            // Sort first and second halves
            sort(arr, lb, mid);
            sort(arr, mid + 1, ub);
 
            // Merge the sorted halves
            mergeso(arr, lb, ub, mid);
        }

    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements");
        for (int i = 0; i < 5; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Given array is");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        merge_sort ob = new merge_sort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array is");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
