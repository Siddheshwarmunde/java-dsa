/*
PATTERN 08: Inverted Star Pyramid

Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

*********
 *******
  *****
   ***
    *
Print the pattern in the function given to you.

Example 1:
Input: n = 4

Output:

*/



import java.util.Scanner;

public class Pattern08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the n : ");
    int n = sc.nextInt();

    for(int i=n; i>=1; i--){
      for(int j=1; j<=n-i; j++){
        System.out.print(" ");
      }
      for(int j=1; j<=2*i-1; j++){
        System.out.print("*");
      }
      System.out.println();
    }


    sc.close();
  }
}
/*
PATTERN 08: Inverted Star Pyramid

Example for n = 5:
*********
 *******
  *****
   ***
    *

HOW TO SOLVE:
1. Take n as input.
2. Start the outer loop from i = n and decrease it to 1.
3. The first inner loop prints spaces: n - i.
4. The second inner loop prints stars: 2 * i - 1.
5. After each row, println() moves to the next line.

TRICK TO REMEMBER:
- Outer loop (i) = rows.
- i = n = start with the widest row.
- i >= 1 = continue until i reaches 1.
- i-- = decrease the row size.
- First inner loop = spaces.
- Second inner loop = stars.
- n - i = spaces increase in each row.
- 2 * i - 1 = odd number of stars (9, 7, 5, 3, 1).
- j++ = count spaces or stars.
- println() = move to the next row.

IMPORTANT:
- Spaces increase in each row.
- Stars decrease by 2 in each row.
- The pyramid becomes narrower toward the bottom.

FORMULAS TO REMEMBER:
Spaces = n - i
Stars  = 2 * i - 1

Difference from Pattern 07:
Pattern 07: i increases from 1 to n.
Pattern 08: i decreases from n to 1.
*/