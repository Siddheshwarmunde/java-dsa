
/*  Pattern 3
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

1
12
123
1234
12345

Print the pattern in the function given to you.

Example 1:
Input: n = 4

Output:

*/

import java.util.Scanner;

public class Pattern03 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the n :");
    int n = sc.nextInt();

    for(int i=1; i<=n; i++){
      for(int j=1; j<=i; j++){
        System.out.print(j);
      }
      System.out.println();
    }

    sc.close();

  }
  
}



// I use an outer loop to process each row from 1 to n. For each row i, an inner loop prints the numbers from 1 to i, followed by a newline. The total number of printed characters is n(n + 1) / 2, so the runtime is O(n^2), while the extra space is O(1).

// follow up questions
// 1. How would you modify the code to print a space between adjacent numbers?
// 2. How would you print the same pattern in descending order within each row?
// 3. What is the total number of digits printed as a function of n?
// 4. Could you generate the pattern into a string instead of printing it directly?

// verdict: The outer loop selects each row from 1 to n. For row i, the inner loop prints j from 1 to i, then the newline starts the next row. This produces exactly the requested pattern and is optimal because every output character must be printed.

// approach: This is the optimal approach because the running time is proportional to the required output size.

/*
PATTERN 03: Number Triangle (Increasing Numbers)

Example for n = 5:
1
12
123
1234
12345

HOW TO SOLVE:
1. Take n as input.
2. Print n rows using the outer loop (i).
3. In each row, print numbers from 1 to i.
4. The inner loop runs from j = 1 to j = i.
5. After each row, println() moves to the next line.

TRICK TO REMEMBER:
- Outer loop (i) = rows.
- Inner loop (j) = numbers to print.
- j = 1 = start printing from 1 in every row.
- j <= i = print numbers up to the current row number.
- j++ = move to the next number.
- i++ = move to the next row.
- print(j) = print the current number j.
- println() = move to the next row.

IMPORTANT:
- print(j) prints increasing numbers in each row.
- print(i) repeats the same number in each row.

*/