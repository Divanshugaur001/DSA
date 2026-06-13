/*
Given an array of integers nums and an integer target. Return the indices(0 - indexed) of two
elements in nums such that they add up to target.
Each input will have exactly one solution, and the same element cannot be used twice.
Return the answer in non-decreasing order.
Examples:
Input: nums = [1, 6, 2, 10, 3], target = 7
Output: [0, 1]
Explanation: nums[0] + nums[1] = 1 + 6 = 7
Input: nums = [1, 3, 5, -7, 6, -3], target = 0
Output: [1, 5]
Explanation: nums[1] + nums[5] = 3 + (-3) = 0

*/
import java.util.Arrays;;
public class twoSum {
   public static void main(String[] args) {
    int arr[]={1, 3, 5, -7, 6, -3};
    int target=0;
    int ans[]=new int[2];
    ans[0]=-1;
    ans[1]=-1;
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            if(arr[i]+arr[j]==target){
                ans[0]=i;
                ans[1]=j;
            }
        }
    }
    Arrays.sort(ans);
    for(int e:ans){
        System.out.print(e+" ");
    }
   } 
}
