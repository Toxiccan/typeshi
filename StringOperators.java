import java.util.*;
class StringOperators
{
    public static void main(String[] args)
    {
        System.out.println('a' + 'b');
        String s = "racecar";
        for(int i = 0;i < s.length();i++)
        {
             System.out.println(s.charAt(i) - 'a');
        }
        System.out.println("a" + "b");
        System.out.println((char)'a' + 3);
        System.out.println("a" + 1);
        System.out.println("a" + new ArrayList<>(1));
        String ans = new Integer(56) + " " +   new ArrayList<>();
        System.out.println(ans);

        String series = "";
        for(int i = 0;i<26;i++)
        {
            char ch = (char)('a' + i);
            System.out.print(ch + " ");
        }
    }
}