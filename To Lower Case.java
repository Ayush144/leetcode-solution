Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

 

Example 1:

Input: s = "Hello"
Output: "hello"
Example 2:

Input: s = "here"
Output: "here"
Example 3:

Input: s = "LOVELY"
Output: "lovely"
 

Constraints:

1 <= s.length <= 100
s consists of printable ASCII characters.
===========================================================================================================================================================================
JAVA SOLUTION

class Solution {
    public String toLowerCase(String s) {
       String str="";
        for(int i=0;i<s.length();i++){
         char ch =s.charAt(i);
        if(ch>='A'  && ch<='Z'){
            ch =(char)(ch-'A'+'a');
            str = str+ch;
        }
       else{
        str =str+ch;
           }
        }
        return str;
    }
}
