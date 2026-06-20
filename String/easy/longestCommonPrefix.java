/*
Example 1
Input:
 str = ["flower", "flow", "flight"]
Output:
 "fl"
Explanation:
 All strings in the array begin with the common prefix "fl".

Example 2
Input:
 str = ["apple", "banana", "grape", "mango"]
Output:
 ""
Explanation:
 None of the strings share a common starting sequence, so the result is an empty string.
            
*/
import java.util.*;
public class longestCommonPrefix {
    public static void main(String[] args) {
        String str[]={"flower","flow","flight"};
    Arrays.sort(str);
    String first=str[0];
    StringBuilder ans = new StringBuilder();
    String last=str[str.length-1];
    for(int i=0;i<first.length();i++){
        if(first.charAt(i)!=last.charAt(i)){
         break;
        }
           ans.append(first.charAt(i));
    }

    System.out.println(ans.toString());
    }
}
