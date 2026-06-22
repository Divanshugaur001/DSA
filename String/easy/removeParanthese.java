
/*
It is the empty string "".
If A is a valid parentheses string, then so is "(" + A + ")".
If A and B are valid parentheses strings, then A + B is also valid.

A primitive valid parentheses string is a non-empty valid string that cannot be split into two or more non-empty valid parentheses strings.

Given a valid parentheses string s, your task is to remove the outermost parentheses from every primitive component of s and return the resulting string.
Examples
Example 1:
Input:
 s = "((()))"
Output:
 "(())"
Explanation:
 The input string is a single primitive: "((()))".  
Removing the outermost layer yields: "(())".

Example 2:
Input:
 s = "()(()())(())"
Output:
 "(()())()"
Explanation:
 Primitive decomposition: "()" + "(()())" + "(())"  
After removing outermost parentheses: "" + "()()" + "()"
Final result: "(()())()".


*/
public class removeParanthese {
    public static void main(String[] args) {
        String s="((())()())(())";
        StringBuilder ans = new StringBuilder();
        int length=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                length++;
                if(length>1){
                    ans.append(s.charAt(i));
                }
            }
            else{
                if(length>1)ans.append(s.charAt(i));
                length--;
                
            }
        }
        System.out.println(ans.toString());
    }
}
