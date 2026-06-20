/*
You are given an integer n. Return the integer formed by placing the digits of n 
in reverse order. 
Examples: 
Input: n = 25 
Output: 52 
Explanation: Reverse of 25 is 52. 
Input: n = 123 
Output: 321 
Explanation: Reverse of 123 is 321.

*/

public class reverseNumer {
    public static void main(String[] args) {
        int num=123;
        int ans =0;
        while(num>0){
                ans*=10;
            ans+=num%10;
            num/=10;
        }
        System.out.println(ans);
    }
}
