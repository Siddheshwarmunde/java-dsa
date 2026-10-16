/*

Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1

Print the pattern in the function given to you.

*/

import java.util.Scanner;
public class Pattern11 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the n : ");
    int n = sc.nextInt();


    for(int i=1; i<=n; i++){
      for(int j=1; j<=i; j++){
        if((i+j)%2==0){
          System.out.print("1 ");
        }
        else{
          System.out.print("0 ");
        }
      }

      System.out.println();
    }

    sc.close();
  }
}