/*

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false

 
*/
import java.util.*;
public class validAnagram{
    public static void main(String[] args) {
        String s="car";
        String t= "act";

    char arr1[]=s.toCharArray();
    char arr2[]=t.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1, arr2));
       
    }
}