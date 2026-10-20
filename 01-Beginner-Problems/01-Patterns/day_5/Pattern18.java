/*
942. Pattern 18
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

E 
D E 
C D E 
B C D E 
A B C D E

Print the pattern in the function given to you.
*/

import java.util.Scanner;

public class Pattern18 {
  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.println("enter the n :");
    int n = sc.nextInt();

    for(int i=1; i<=n; i++){
      for(int j=n-i+1; j<=n; j++){
        System.out.print((char)('A'+j-1) + " "); // a=65, j+n-1;
      }
      System.out.println();
    }

    sc.close();
  }
}
