import java.util.*;

class MaximumToys {

    static int toyCount(int N, int K, int arr[]) {

        Arrays.sort(arr);

        int count = 0;

        for (int i = 0; i < N; i++) {

            if (K >= arr[i]) {
                K = K - arr[i];
                count++;
            } 
            else {
                break;
            }
        }

        return count;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(toyCount(N, K, arr));

        sc.close();
    }
}