
/*
898. Pattern 10
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

*
**
***
****
*****
****
***
**
*

Print the pattern in the function given to you.

*/

public class Pattern10 {
  public static void main(String[] args) {
    int n=5;

    for(int i=1; i<=n; i++){
      for(int j=1; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    
    for(int i=n-1; i>=1; i--){
      for(int j=1; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }


  }
}
