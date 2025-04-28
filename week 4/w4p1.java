import java.util.*;
public class w4p1 {
    static int comp=0;
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
            mergeSort(n,arr,0,n-1);
            for(int i=0; i<n; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println("\ncomparisons: "+comp);
        }
        sc.close();
    }
    public static void mergeSort(int n, int arr[], int l, int r) {
        if(l>=r) {
            return ;
        }
        int mid = l + (r-l)/2;
        mergeSort(n, arr, l, mid);
        mergeSort(n, arr, mid+1, r);
        merge(n,arr,l,mid,r);
    }
    public static void merge(int n, int arr[], int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i=0; i<n1; i++) {
            left[i] = arr[l+i];
        }
        for(int i=0; i<n2; i++) {
            right[i] = arr[mid+i+1];
        }
        int i=0, j=0, k=l;
        while(i<n1 && j<n2) {
            comp++;
            if(left[i] <= right[j]) {
                arr[k++] = left[i++];
            }
            else {
                arr[k++] = right[j++];
            }
        }
        while(i<n1) {
            arr[k++] = left[i++];
        }
        while(j<n2) {
            arr[k++] = right[j++];
        }
    }
}