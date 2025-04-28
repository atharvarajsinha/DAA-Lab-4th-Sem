import java.util.*;
class w1p3 {
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
            j_search(n,arr,key);
        }
        sc.close();
    }
    public static void j_search(int n, int arr[], int key) {
        int i=0, jump=(int)Math.sqrt(n), step=0, c=0;
        while(arr[step]<key && step<n-1) {
            i=step;
            step += jump;
        }
        step = Math.min(step,n-1);
        for(int j=i; j<=step; j++) {
            c++;
            if(arr[j]==key) {
                System.out.println("Present "+c);
                return ;
            }
        }
        System.out.println("Not Present "+c);
    }
}