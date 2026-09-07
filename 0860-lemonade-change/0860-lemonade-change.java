class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for(int i = 0;i < bills.length;i++)
        {

            int net_trans = bills[i];
            if(net_trans == 5)
            {
                five++;
            }
            if(net_trans == 10)
            {
                if(five > 0)
                {
                    five--;
                    ten++;
                }
                else return false;
            }
            if(net_trans == 20)
            {
                if(five > 0 && ten > 0)
                {
                    five--;
                    ten--;
                }
                else if(five >= 3)
                {
                    five -= 3;
                }
                else return false;
            }   
        }
        return true;
        
    }
}