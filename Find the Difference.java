You are given two strings s and t.

String t is generated by random shuffling string s and then add one more letter at a random position.

Return the letter that was added to t.

 

Example 1:

Input: s = "abcd", t = "abcde"
Output: "e"
Explanation: 'e' is the letter that was added.
Example 2:

Input: s = "", t = "y"
Output: "y"
 

Constraints:

0 <= s.length <= 1000
t.length == s.length + 1
s and t consist of lowercase English letters.
========================================================================================================================================================================
JAVA SOLUTION

class Solution {
    public char findTheDifference(String s, String t) {
 
        char c=0;
        for(char ch: s.toCharArray()){
            c^=ch;
        }
        for(char ch: t.toCharArray()){
            c^=ch;
        }
        
      return c;
    }
}
