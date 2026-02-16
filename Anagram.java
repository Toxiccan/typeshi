import java.util.*;

class Anagram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println("Both s and t are anagram or not :" + isAnagram(s, t));
    }

    public static boolean isAnagram(String s,String t)
    {
        if(s.length() != t.length()) return false;

        int[] count = new int[26];

        for(int i = 0;i<s.length();i++)
        {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int c:count)
        {
            if(c!=0) return false;
        }

        return true;
    }
}