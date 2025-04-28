import java.util.*;
public class w4p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            if(k >= n) {
                System.out.println("Not Present");
                continue;
            }
            Arrays.sort(arr);
            for(int i=0; i<n; i++) {
                if(k==1) {
                    System.out.println(arr[i]);
                    break;
                }
                k--;
            }
        }
        sc.close();
    }
}