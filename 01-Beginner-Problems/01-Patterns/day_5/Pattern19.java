/*
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
*/

import java.util.Scanner;

public class Pattern19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the n : ");
    int n = sc.nextInt();

  for(int i=0; i<n; i++){
    for(int j=0; j<n-i; j++){
      System.out.print("*");
    }
  }



    sc.close();
  }
}
