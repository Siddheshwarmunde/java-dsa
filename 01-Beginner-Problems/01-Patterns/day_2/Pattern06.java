
/*
PATTERN 06: Inverted Number Triangle

Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

12345
1234
123
12
1

Print the pattern in the function given to you.

*/


import java.util.Scanner;

public class Pattern06 {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the n: ");
    int n = sc.nextInt();

    for(int i=n; i>=1; i--){
      for(int j=1; j<=i; j++){
        System.out.print(j);
      }
      System.out.println();
    }
    sc.close();


  }
}


/*
PATTERN 06: Inverted Number Triangle

Example for n = 5:
12345
1234
123
12
1

HOW TO SOLVE:
1. Take n as input.
2. Start the outer loop from i = n and decrease it to 1.
3. In each row, print numbers from 1 to i.
4. The inner loop runs from j = 1 to j = i.
5. After each row, println() moves to the next line.

TRICK TO REMEMBER:
- Outer loop (i) = rows.
- Inner loop (j) = numbers to print.
- i = n = start with the largest row.
- i >= 1 = continue until i reaches 1.
- i-- = decrease the row size by 1.
- j = 1 = start printing from 1 in every row.
- j <= i = print numbers up to i.
- j++ = move to the next number.
- print(j) = print the current number.
- println() = move to the next row.

IMPORTANT:
- i controls how many numbers to print.
- j controls which number to print.

*/