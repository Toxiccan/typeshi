class Solution {
    public int buyChoco(int[] prices, int money) {
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;
        for(int i = 0;i < prices.length;i++)
        {
            if(prices[i] < smallest)
            {
                secondsmallest = smallest;
                smallest = prices[i];
            }
            else if(prices[i] <= secondsmallest)
            {
                secondsmallest = prices[i];
            }
        }
        if(smallest + secondsmallest <= money)
        {
            return money - (smallest + secondsmallest);
        }
        return money;
        
    }
}