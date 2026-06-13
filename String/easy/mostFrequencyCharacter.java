/*
Average Time: 30m
Given a string s of lowercase alphabets. The task is to find the maximum occurring character in the string s. If more than one character occurs the maximum number of times then print the lexicographically smaller character.

Examples:

Input: s = "testsample"
Output: 'e'
Explanation: 'e' is the character which is having the highest frequency.
Input: s = "output"
Output: 't'
Explanation: 't' and 'u' are the characters with the same frequency, but 't' is lexicographically smaller.
*/
public class mostFrequencyCharacter {
 public static void main(String[] args) {
         String s = "testsample";  
int arr[]= new int[26];

for(int i=0;i<s.length();i++){
    char a=s.charAt(i);
    arr[a-'a']++;
}
int max=-1;
char ans='a';
for(int i=0;i<arr.length;i++){
    if(arr[i]>max){
        max=arr[i];
        ans=(char)(i+'a');
    }
}
System.out.println(ans);
}
}