class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) 
    {
        int arriveA = Convert(arriveAlice);
        int leaveA = Convert(leaveAlice);
        int arriveB = Convert(arriveBob);
        int leaveB = Convert(leaveBob);

        int start = Math.max(arriveA,arriveB);
        int end = Math.min(leaveA,leaveB);

        if(start > end)
        {
            return 0;
        }

        return end - start + 1;
    }

    public int Convert(String s)
    {
        int result = 0;
        int month = Integer.parseInt(s.substring(0,2));
        int day = Integer.parseInt(s.substring(3,5));

        for(int i = 1;i < month;i++)
        {
            result = result + DaysinMonth(i);
        }
        return result + day;
    }

    public int DaysinMonth(int month)
    {
        if(month == 2)
        {
            return 28;
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11)
        {
            return 30;
        }
        else
        {
            return 31;
        }
    }
}