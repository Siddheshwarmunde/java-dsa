/*
 Pattern 7
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
