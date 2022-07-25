// Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

// Note that after backspacing an empty text, the text will continue empty.

 

// Example 1:

// Input: s = "ab#c", t = "ad#c"
// Output: true
// Explanation: Both s and t become "ac".
// Example 2:

// Input: s = "ab##", t = "c#d#"
// Output: true
// Explanation: Both s and t become "".
// Example 3:

// Input: s = "a#c", t = "b"
// Output: false
// Explanation: s becomes "c" while t becomes "b".
 

// Constraints:

// 1 <= s.length, t.length <= 200
// s and t only contain lowercase letters and '#' characters.
// ==============================================================================================================================================================
// JAVA SOLUTION

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        String   news="";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='#'){
                if(!st.isEmpty()){
                st.pop();
                }
            }
            else{
                st.push(ch);
            }
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(ch=='#'){
                if(!st2.isEmpty()){
                st2.pop();
                }
            }
            else{
                st2.push(ch);
            }
        }
    while(!st.isEmpty() && !st2.isEmpty()){
        if(st.pop()!=st2.pop()){
            return false;
        }
        
    }
        if(st.isEmpty() && st2.isEmpty()){
            return true;
        }
        
        return false;
    }
}
