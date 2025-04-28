import java.util.*;
public class w3p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            mergeSort(arr,0,n-1);
            boolean flag=false;
            for(int i=0; i<n-1; i++) {
                if(arr[i]==arr[i+1]) {
                    flag=true;
                    break ;
                }
            }
            if(flag) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
    public static void mergeSort(int arr[], int l, int r) {
        if(l>=r) {
            return ;
        }
        int mid = l + (r-l)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr,l,mid,r);
    }
    public static void merge(int arr[], int l, int m, int r) {
        int n1 = m-l+1;
        int n2 = r-m;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i=0; i<n1; i++) {
            left[i] = arr[i+l];
        }
        for(int i=0; i<n2; i++) {
            right[i] = arr[m+1+i];
        }
        int k=l, i=0, j=0;
        while(i<n1 && j<n2) {
            if(left[i]<=right[j]) {
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