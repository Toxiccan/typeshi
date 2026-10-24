class Solution
{
    public int daysBetweenDates(String date1, String date2)
    {
        int d1 = Convert(date1);
        int d2 = Convert(date2);
        return Math.abs(d1 - d2);
    }

    public int Convert(String s)
    {
        int result = 0;
        int year = Integer.parseInt(s.substring(0,4));
        int month = Integer.parseInt(s.substring(5,7));
        int day= Integer.parseInt(s.substring(8,10));
        for(int i = 1971;i < year;i++)
        {
            result = result + isLeapYear(i);
        }
        for(int i = 1;i < month;i++)
        {
            result = result + daysinMonth(i,year);
        }
        return result + day;
    }

    public int daysinMonth(int month,int year)
    {
        if(month == 4 || month == 6 || month == 9 || month == 11)
        {
            return 30;
        }
        else if(month == 2 && isLeapYear(year) == 366)
        {
            return 29;
        }
        else if(month == 2 && isLeapYear(year) == 365)
        {
            return 28;
        }
        else
        {
            return 31;
        }
    }

    public int isLeapYear(int year)
    {
        if((year % 400 == 0) || (year % 4 == 0 && (year % 100 != 0)))
        {
            return 366;
        }
        return 365;
    }

}