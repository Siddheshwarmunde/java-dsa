
/*
 PATTERN 05: INVERTED RIGHT-ANGLED TRIANGLE

Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

*****
****
***
**
*

Print the pattern in the function given to you.

*/

import java.util.Scanner;

class Pattern05{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("enter the n: ");
    int n = sc.nextInt();

    for(int i=n; i>=1; i--){
      for(int j=1; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }

    sc.close();
  }
}

/*
PATTERN 05: Inverted Right-Angled Triangle

HOW TO SOLVE:
1. Take n as input.
2. Start the outer loop from i = n and decrease it to 1.
3. In each row, print stars equal to the current value of i.
4. The inner loop runs from j = 1 to j = i.
5. j++ increases j by 1 after printing each star.
6. i-- decreases i by 1 after each row.
7. After each row, println() moves to the next line.

TRICK TO REMEMBER:
- Outer loop (i) = rows.
- Inner loop (j) = stars in the current row.
- i >= 1 means continue until i reaches 1.
- j <= i means print stars until j reaches i.
- i-- = decrease the number of stars in each row.
- j++ = count stars from 1 to i.
- print("*") = stay on the same line.
- println() = move to the next row.

*/