import java.util.*;
public class w2p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            int key = sc.nextInt();
            System.out.println(countPairs(n, arr, key));
        }
        sc.close();
    }
    public static int countPairs(int n, int arr[], int key) {
        int count=0;
        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                if(Math.abs(arr[i]-arr[j])==key) {
                    count++;
                }
            }
        }
        return count;
    }
}
