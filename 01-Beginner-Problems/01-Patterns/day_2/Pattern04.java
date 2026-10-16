
/*
PATTERN 04: Number Triangle
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

1
22
333
4444
55555

Print the pattern in the function given to you.

*/

import java.util.Scanner;

public class Pattern04 {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the n : ");
  int n = sc.nextInt();

  for(int i=1; i<=n; i++){
    for(int j=1; j<=i; j++){
      System.out.print(i);
    }
    System.out.println();
  }




  sc.close();
}
}

/*
PATTERN 04: Number Triangle

Example for n = 5:
1
22
333
4444
55555

HOW TO SOLVE:
1. Take n as input.
2. Print n rows using the outer loop (i).
3. In each row, print the current row number i.
4. The inner loop runs from j = 1 to j = i.
5. After each row, println() moves to the next line.

TRICK TO REMEMBER:
- Outer loop (i) = rows.
- Inner loop (j) = how many times to print.
- System.out.print(i) = print the row number.
- j <= i = print the number i times.
- j++ = increase the counter by 1.
- i++ = move to the next row.
- print() = stay on the same line.
- println() = move to the next row.

IMPORTANT:
- print(i) prints the row number.
- print(j) would print the counting numbers instead.


*/