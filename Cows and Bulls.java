// You are playing the Bulls and Cows game with your friend.

// You write down a secret number and ask your friend to guess what the number is. When your friend makes a guess, you provide a hint with the following info:

// The number of "bulls", which are digits in the guess that are in the correct position.
// The number of "cows", which are digits in the guess that are in your secret number but are located in the wrong position. Specifically, the non-bull digits in the guess that could be rearranged such that they become bulls.
// Given the secret number secret and your friend's guess guess, return the hint for your friend's guess.

// The hint should be formatted as "xAyB", where x is the number of bulls and y is the number of cows. Note that both secret and guess may contain duplicate digits.

 

// Example 1:

// Input: secret = "1807", guess = "7810"
// Output: "1A3B"
// Explanation: Bulls are connected with a '|' and cows are underlined:
// "1807"
//   |
// "7810"
// Example 2:

// Input: secret = "1123", guess = "0111"
// Output: "1A1B"
// Explanation: Bulls are connected with a '|' and cows are underlined:
// "1123"        "1123"
//   |      or     |
// "0111"        "0111"
// Note that only one of the two unmatched 1s is counted as a cow since the non-bull digits can only be rearranged to allow one 1 to be a bull.
 

// Constraints:

// 1 <= secret.length, guess.length <= 1000
// secret.length == guess.length
// secret and guess consist of digits only.
// ====================================================================================================================================================================
// JAVA SOLUTION

class Solution {
    public String getHint(String s, String g) {
        String res ="";
        int cow=0,bull=0;
        HashMap<Character,Integer> map = new  HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            char ch= g.charAt(i);
            if(c==ch){
                bull++;
            }
            else{
                map.put(c,map.getOrDefault(c,0)+1);
            }
            
        }
        for(int i=0;i<g.length();i++){
                   char ch = s.charAt(i);
            char c= g.charAt(i);
            if(c!=ch && map.getOrDefault(c,0)>0){
                cow++;
                map.put(c,map.get(c)-1);
            }
        }
        res =bull+"A"+cow+"B";
       
        return res ;  
        
    }
}
