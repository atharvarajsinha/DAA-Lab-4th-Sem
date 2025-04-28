import java.util.*;
public class w2p1 {
    public static void main(String[] args) {
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
            l_bound(n,arr,key);
        }
        sc.close();
    }
    public static void l_bound(int n, int arr[], int key) {
        int l=0, r=n-1;
        while(l<r) {
            int mid = l + (r-l)/2;
            if(arr[mid] < key) {
                l = mid+1;
            }
            else {
                r = mid;
            }
        }
        if(l==n) {
            System.out.println(key+" - 0");
            return ;
        }
        int c=0;
        for(int i=l; i<n; i++) {
            if(arr[i]==key) c++;
        }
        System.out.println(key+" - "+c);
    }
}
