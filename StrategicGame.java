/*Arya and Veer are playing a strategic number game.

Rules of the game:
    * Arya always plays first.
    * Players alternately choose one number from the list.
    * If Arya picks an even number, its value gets added to her score.
    * If Veer picks an odd number, its value gets added to his score.
    * Both players always make the best possible move.
    * The game ends once all numbers are removed.

Determine the winner:
    * Print `ARYA` if Arya wins
    * Print `VEER` if Veer wins
    * Print `DRAW` if both scores are equal

Input Format
------------
First line contains integer `T` representing test cases.
For every test case:
    - First line contains integer `N`
    - Second line contains `N` integers.


Constraints
-----------
 `1 <= T <= 10^5`
 `1 <= N <= 10^5`
 `1 <= arr[i] <= 10^4`


Sample Input
------------
3
5
8 1 6 3 4
6
9 8 7 6 5 4
5
1 3 5 7 9

Sample Output
-------------
ARYA
DRAW
VEER

Explanation
----------------
After rearragning the data for optima picks:
8 1 6 3 4 => 8 6 4 3 1 
Arya gets [8,4,1] => 12 as the total value.
Veer gets [1,3] => 4 as the total value. So ARYA wins.

After rearragning the data for optima picks:
9 8 7 6 5 4 => 9 8 7 6 5 4
Arya gets [9, 7, 4] => 0 as the total value.
Veer gets [8,6,4] => 0 as the total value. So its a DRAW.

After rearragning the data for optima picks:
1 3 5 7 9 => 9 7  3 5 1
Arya gets [9,3,1] => 0 as the total value.
Veer gets [7,5] => 12 as the total value. So VEER wins.
 */

import java.util.*;

class StrategicGame
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0)
        {
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i = 0;i < n;i++)
            {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);

            long arya = 0;
            long veer = 0;
            int turn = 0;

            for(int i = n-1;i>=0;i--)
            {
                if(turn % 2 == 0)
                {
                    if(arr[i] % 2 == 0)
                    {
                        arya += arr[i];
                    }
                }

                else
                {
                    if(arr[i] % 2 != 0)
                    {
                        veer += arr[i];
                    }
                }
                turn++;
            }
            if(arya > veer)
            {
                System.out.println("ARYA");
            }
            else if(veer > arya)
            {
                System.out.println("ARYA");
            }
            else
            {
                System.out.println("DRAW");
            }
        }
    }
}