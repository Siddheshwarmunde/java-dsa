/*
Pattern 15
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

ABCDE
ABCD
ABC
AB
A

Print the pattern in the function given to you.
*/


import java.util.Scanner;
public class Pattern15 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the n : ");
    int n = sc.nextInt();

for(int i=n; i>=1; i--){
  for(int j=1; j<=i; j++){
    System.out.print((char)('A'+j-1));
  }
  System.out.println();
}

    sc.close();
  }
}