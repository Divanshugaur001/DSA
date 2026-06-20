/*
You are given an integer n. You need to return the number of odd digits present in the 
number. 
The number will have no leading zeroes, except when the number is 0 itself. 
Examples: 
Input: n = 5 
Output: 1 
Explanation: 5 is an odd digit. 
Input: n = 25 
Output: 1 
Explanation: The only odd digit in 25 is 5. 
*/
public class countOddDigit {
    public static void main(String[] args) {
        int num=12345;
        int cnt=0;
        while(num>0){
            int val=num%10;
            if(val%2!=0)cnt++;
            num=num/10;
        }
        System.out.println(cnt);
    }
}
