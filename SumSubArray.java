import java.util.*;

class SumSubArray
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int I = sc.nextInt();
        int arr[] = new int[P];
        int totalsubarray = P*(P+1)/2;
        int sumarr[] = new int[totalsubarray];
        int k = 0;

        for(int i = 0;i < P;i++)
        {
            arr[i] = sc.nextInt();

        }
        for(int i = 0;i < P;i++)
        {
            int sum = 0;
            for(int j = i;j < P;j++)
            {
                sum += arr[j];
                sumarr[k++] = sum;
            }
        }

        Arrays.sort(sumarr);

        System.out.println(sumarr[I-1]);
    }
}
