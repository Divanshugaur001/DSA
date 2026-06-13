/*
You are given an array of integers. Return the sum of all the array elements.

Examples:

Input: arr[] = [54, 43, 2, 1, 5]
Output: 105
Explanation: Just sum it 54 + 43 + 2 + 1 + 5 = 105.
Input: arr[] = [324, 5, 2, 2]
Output: 333
Explanation: Just sum it 324 + 5 + 2 + 2 = 333.


*/
public class sumArrayElement {
    public static void main(String[] args) {
        int arr[]={54,43,2,1,5};
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
