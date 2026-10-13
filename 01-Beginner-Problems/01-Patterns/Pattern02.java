/* 
Pattern 02 — Right-Angled Triangle

Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

*
**
***
****
*****

Print the pattern in the function given to you.
Example 1:
Input: n = 4
Output:

*/


import java.util.Scanner;

public class Pattern02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}

/*
PATTERN 02: Right-Angled Triangle

HOW TO SOLVE:
1. Take n as input.
2. Print n rows using the outer loop.
3. In each row, print stars equal to the row number i.
4. The inner loop runs from j = 1 to j = i.
5. After each row, println() moves to the next line.

TRICK TO REMEMBER:
- Outer loop (i) = rows.
- Inner loop (j) = stars in the current row.
- Number of stars = current row number (i).
- print("*") = stay on the same line.
- println() = move to the next row.

Difference from Pattern 01:
Pattern 01: Every row has n stars.
Pattern 02: Row i has i stars.
*/