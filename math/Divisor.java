/*
ou are given an integer n. You need to find all the divisors of n. Return all 
the divisors of n as an array or list in a sorted order. 
A number which completely divides another number is called it's divisor. 
Examples: 
Input: n = 6 
Output = [1, 2, 3, 6] 
Explanation: The divisors of 6 are 1, 2, 3, 6. 


*/

import java.util.*;
public class Divisor {
    public static void main(String[] args) {
        int n=6;
        ArrayList<Integer> l = new ArrayList<>();

        for(int i=1;i<=n;i++){
            if(n%i==0)l.add(i);
        }
        for(int e:l){
            System.out.print(e+" ");
        }
    }
}
