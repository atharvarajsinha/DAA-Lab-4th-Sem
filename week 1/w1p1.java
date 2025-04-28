import java.util.*;
class w1p1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            int key = sc.nextInt();
            l_search(n,arr,key);
        }
        sc.close();
    }
    public static void l_search(int n, int arr[], int key) {
        int c=0;
        for(int i=0; i<n; i++) {
            c++;
            if(arr[i]==key) {
                System.out.println("Present "+c);
                return ;
            }
        }
        System.out.println("Not Present "+c);
    }
}