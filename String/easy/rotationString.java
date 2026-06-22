/*
Example 1:
Input:
 s = "rotation", goal = "tionrota"
Output:
 true
Explanation:
 After multiple left shifts on "rotation", we get:
    1st shift → "otationr"
    2nd shift → "tationro"
    3rd shift → "ationrot"
    4th shift → "tionrota"
    So the goal string can be obtained by rotating the original string.

Example 2:
Input:
 s = "hello", goal = "lohelx"
Output:
 false
Explanation:
 
Even after all possible rotations of "hello", we cannot form "lohelx" due to the presence of an extra character 'x'. Hence, it's not possible.

*/


public class rotationString {
    public static void main(String[] args) {
        String s= "hello";
        String t= "lohelx";
        if(s.length()!=t.length()){
            System.out.println("false");
        return ;}

        String doubled=s+s;
        if(doubled.contains(t))System.out.println("true");
        else System.out.println("false");

    }
}
