import java.util.*;
public class w3p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            selectionSort(n,arr);
        }
        sc.close();
    }
    public static void selectionSort(int n, int arr[]) {
        int comp=0, swaps=0;
        for(int i=0; i<n-1; i++) {
            int min=i;
            for(int j=i+1; j<n; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
                comp++;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            swaps++;
        }
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\ncomparisons = "+comp+"\nswaps = "+swaps);
    }
}
