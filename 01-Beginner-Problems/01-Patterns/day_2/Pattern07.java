
/*
PATTERN 07: Star Pyramid
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

    *
   ***
  *****
 *******
*********
Print the pattern in the function given to you.

*/


import java.util.Scanner;

public class Pattern07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the n: ");
    int n = sc.nextInt();

    for(int i=1; i<=n; i++){
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


// Remember these two formulas
// For this pyramid pattern:
// - Spaces: n - i
// - Stars: 2 * i - 1

/*
PATTERN 07: Star Pyramid

Example for n = 5:
    *
   ***
  *****
 *******
*********

HOW TO SOLVE:
1. Take n as input.
2. The outer loop (i) prints n rows.
3. The first inner loop prints spaces: n - i.
4. The second inner loop prints stars: 2 * i - 1.
5. After each row, println() moves to the next line.

TRICK TO REMEMBER:
- Outer loop (i) = rows.
- First inner loop = spaces.
- Second inner loop = stars.
- i++ = move to the next row.
- n - i = spaces decrease in each row.
- 2 * i - 1 = odd number of stars (1, 3, 5, 7...).
- j++ = count spaces or stars.
- j <= n - i = print the required spaces.
- j <= 2 * i - 1 = print the required stars.
- print(" ") = print one space.
- print("*") = print one star.
- println() = move to the next row.

IMPORTANT:
- Spaces decrease as rows increase.
- Stars increase by 2 in every row.
- Both inner loops use j, but they run separately.

FORMULAS TO REMEMBER:
Spaces = n - i
Stars  = 2 * i - 1
*/