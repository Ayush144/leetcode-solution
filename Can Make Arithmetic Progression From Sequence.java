A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.

Given an array of numbers arr, return true if the array can be rearranged to form an arithmetic progression. Otherwise, return false.

 
testcases
Example 1:

Input: arr = [3,5,1]
Output: true
Explanation: We can reorder the elements as [1,3,5] or [5,3,1] with differences 2 and -2 respectively, between each consecutive elements.
Example 2:

Input: arr = [1,2,4]
Output: false
Explanation: There is no way to reorder the elements to obtain an arithmetic progression.
 

Constraints:

2 <= arr.length <= 1000
-106 <= arr[i] <= 106
===========================================================================================================================================================================
JAVA SOLUTION

class Solution {
    public boolean canMakeArithmeticProgression(int[] a) {
        Arrays.sort(a);
        int differnce=a[1]-a[0];
        for(int i=1;i<a.length-1;i++){
           int  diff=a[i+1]-a[i];
            if(differnce!=diff){
               return false;
            }
        }
     return true;   
    }
}
