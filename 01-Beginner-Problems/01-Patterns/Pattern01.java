// Pattern 01 — Square Star Pattern

/* Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

*****
*****
*****
*****
*****

Print the pattern in the function given to you.

Example 1:
Input: n = 4
Output:
*/

import  java.util.Scanner;


public class Pattern01 {

  public static void main(String[] args){
 
    Scanner sc = new Scanner(System.in);
    System.out.println("enter n: ");
    int n = sc.nextInt();

    for(int i =0; i<n; i++){
      for(int j=0; j<n; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    sc.close();
  }
}

/*
HOW TO SOLVE:
1. Count the rows → n rows.
2. Each row needs n stars.
3. Use the outer loop to go row by row.
4. Use the inner loop to print n stars in each row.
5. After printing stars, move to the next line.

Trick :
Outer loop (i) = controls rows.
Inner loop (j) = controls columns (stars in each row).
print("*") = prints on the same line.
println() = moves to the next row.
*/


// I use an outer loop to create n rows. For each row, an inner loop prints n stars, then I move to the next line. This takes O(n^2) time, which is optimal because there are n^2 characters to print.