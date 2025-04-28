import java.util.*;
class w1p2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int key = sc.nextInt();
            b_search(n,arr,key);
        }
        sc.close();
    }
    public static void b_search(int n, int arr[], int key) {
        int l=0, r=n-1, c=0;
        while(l <= r) {
            int mid = l + (r-l)/2;
            c++;
            if(arr[mid]==key) {
                System.out.println("Present "+c);
                return ;
            }
            else if(arr[mid] < key) {
                l = mid+1;
            }
            else {
                r = mid-1;
            }
        }
        System.out.println("Not Present "+c);
    }
}