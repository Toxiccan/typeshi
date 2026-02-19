import java.util.*;

class Stock1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prices[] = new int[n];
        for(int i = 0;i < n;i++)
        {
            prices[i] = sc.nextInt();
        }
        System.out.println("Best Buy and Sell Stock:"+ MaxProfit(prices));
    }
    public static int MaxProfit(int prices[])
    {
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i = 1;i < prices.length;i++)
        {
            int current = prices[i] - minPrice;
            maxProfit = Math.max(current,maxProfit);
            minPrice = Math.min(prices[i],minPrice);

        }
        return maxProfit;

    }
}