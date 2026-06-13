
/*
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
*/

import java.util.*;

class reverseWordOfString {
    public static void main(String[] args) {
         String s = "  hello world  ";
        StringBuilder res = new StringBuilder();
        Stack<String> stk = new Stack<>();
        String word="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                word+=s.charAt(i);
            }
            else if(word.length()>0){
                stk.push(word);
                word="";
            }

        } 
          if(word.length()>0){
            stk.push(word);
          }

          while(!stk.isEmpty()){
            res.append(stk.pop()+" ");
          }

          System.out.println(res);
 }
}