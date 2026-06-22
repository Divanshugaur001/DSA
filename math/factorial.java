/*
You are given an integer n. Return the value of n! or n factorial. 
Factorial of a number is the product of all positive integers less than or equal to that 
number. 
Examples: 
Input: n = 2 
Output: 2 
Explanation: 2! = 1 * 2 = 2. 
Input: n = 0 
Output: 1 
Explanation: 0! is defined as 1.

*/

public class factorial {
  public static void main(String[] args) {
    int n=5;
    if(n==0){
        System.out.println(1);
        return;
    }
    int ans=1;
    for(int i=n;i>=1;i--){
        ans*=i;
    }
    System.out.print(ans);
  }  
}
