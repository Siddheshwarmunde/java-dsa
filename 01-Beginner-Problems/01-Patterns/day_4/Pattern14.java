/*
920. Pattern 14
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

A
AB
ABC
ABCD
ABCDE

Print the pattern in the function given to you.

*/

import java.util.Scanner;

public class Pattern14 {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the n : ");
  int n = sc.nextInt();

  for(int i=1; i<=n; i++){
    for(int j=1; j<=i; j++){
      System.out.print((char)('A'+ j-1));
    }
    System.out.println();
  }


  sc.close();
}  
}
