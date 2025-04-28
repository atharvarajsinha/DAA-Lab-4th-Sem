import java.util.*;
public class w3p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            insertionSort(n,arr);
        }
        sc.close();
    }
    public static void insertionSort(int n, int arr[]) {
        int shift=0, comp=0;
        for(int i=1; i<n; i++) {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key) {
                arr[j+1]=arr[j];
                j=j-1;
                
                comp++;
                shift++;
            }
            arr[j+1] = key;
            shift++;
        }
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\ncomparisons = "+comp+"\nshifts = "+shift);
    }
}
