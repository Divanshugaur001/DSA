/*

You are given an integer n. You need to return the number of digits in the number. 
The number will have no leading zeroes, except when the number is 0 itself. 
Examples: 
Input: n = 4 
Output: 1 
Explanation: There is only 1 digit in 4. 
Input: n = 14 
Output: 2 
Explanation: There are 2 digits in 14.

*/


public class countAllDigit {
public static void main(String[] args) {
    int num=56;
    int cnt=0;
    while(num>0){
cnt++;
num=num/10;
    }

    System.out.print(cnt);
}
}