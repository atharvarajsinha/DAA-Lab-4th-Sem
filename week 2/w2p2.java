import java.util.*;
public class w2p2 {
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
            sequence(n,arr);
        }
        sc.close();
    }
    public static void sequence(int n, int arr[]) {
        for(int i=0; i<n-2; i++) {
            for(int j=i+1; j<n-1; j++) {
                for(int k=j+1; k<n; k++) {
                    if(arr[i]+arr[j] == arr[k]) {
                        System.out.println((i+1)+", "+(j+1)+", "+(k+1));
                        return ;
                    }
                }
            }
        }
        System.out.println("No sequence found.");
    }
}
