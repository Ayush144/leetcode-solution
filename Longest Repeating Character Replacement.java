// You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.

// Return the length of the longest substring containing the same letter you can get after performing the above operations.

 

// Example 1:

// Input: s = "ABAB", k = 2
// Output: 4
// Explanation: Replace the two 'A's with two 'B's or vice versa.
// Example 2:

// Input: s = "AABABBA", k = 1
// Output: 4
// Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
// The substring "BBBB" has the longest repeating letters, which is 4.
 

// Constraints:

// 1 <= s.length <= 105
// s consists of only uppercase English letters.
// 0 <= k <= s.length
// =======================================================================================================================================================================
// JAVA SOLUTION
class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int left=0,repeat=0,max=0;
        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            if(!map.containsKey(ch)){
                map.put(ch,0);
            }
            map.put(ch,map.get(ch)+1);
            repeat = Math.max(repeat,map.get(ch));
            if(right-left+1-repeat>k){
                char delete = s.charAt(left);
                map.put(delete,map.get(delete)-1);
                left++;
                
            }
            max=Math.max(max,right-left+1);
            
        }
        return max;
        
    }
}
