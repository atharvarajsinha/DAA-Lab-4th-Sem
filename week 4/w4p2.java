import java.util.*;
public class w4p2 {
    static int comp=0, swaps=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            comp=0;
            swaps=0;
            quickSort(arr,n,0,n-1);
            for(int num : arr) {
                System.out.print(num+" ");
            }
            System.out.println("\nComparisons: "+comp+"\nSwaps: "+swaps);
        }
        sc.close();
    }
    public static void quickSort(int arr[], int n, int l, int r) {
        if(l >= r) {
            return ;
        }
        int p = partition(arr,n,l,r);
        quickSort(arr, n, l, p-1);
        quickSort(arr, n, p+1, r);
    }
    public static int partition(int arr[], int n, int l, int r) {
        int pivot = arr[l];
        int i=l+1, j=r;
        while(i < j) {
            while(i<=r && arr[i]<=pivot) {
                i++;
                comp++;
            }
            while(arr[j] > pivot) {
                j--;
                comp++;
            }
            if(i<j) {
                swap(arr,i,j);
            }
        }
        swap(arr,l,j);
        return j;
    }
    public static void swap(int arr[], int i, int j) {
        swaps++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
