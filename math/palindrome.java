/*
You are given an integer n. You need to check whether the number is a palindrome number 
or not. Return true if it's a palindrome number, otherwise return false. 
A palindrome number is a number which reads the same both left to right and right to left. 
Examples: 
Input: n = 121 
Output: true 
Explanation: When read from left to right : 121. 
When read from right to left : 121. 
Input: n = 123

*/

public class palindrome {
   public static void main(String[] args) {
    int n=12321;
    int num=n;
    int ans=0;

    while(num>0){
        ans*=10;
        ans+=num%10;
        num/=10;
    }
System.out.println(ans);
     System.out.println(n==ans);
   } 
}
