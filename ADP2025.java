/*Arjun purchased a collection of integer tokens from a store. Later, he realized that several token values appeared multiple times.

Arjun now wants to organize the collection such that:
	* Every value appears only once
	* The values are arranged in increasing order
	* Each value is printed on a separate line

Write a program to help Arjun create this cleaned collection.

Input Format
The first line contains an integer `N` representing the number of tokens.
The next `N` lines contain one integer each.

Constraints

`1 <= N <= 10^5`
`1 <= value <= 10^5`

Sample Input
6
4
2
4
1
3
2

Sample Output
1
2
3
4*/

import java.util.*;
class ADP2025
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        TreeSet<Integer> map =new TreeSet<>();

        for(int i = 0;i < n;i++)
        {
            map.add(sc.nextInt());
        }

        for(int val : map)
        {
            System.out.println(val);
        }

    }

}
