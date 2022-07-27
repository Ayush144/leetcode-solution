Given an integer array nums, return the largest perimeter of a triangle with a non-zero area, formed from three of these lengths. If it is impossible to form any triangle of a non-zero area, return 0.

 

Example 1:

Input: nums = [2,1,2]
Output: 5
Example 2:

Input: nums = [1,2,1]
Output: 0
 

Constraints:

3 <= nums.length <= 104
1 <= nums[i] <= 106
=======================================================================================================================================================================
JAVA SOLUTION

class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        
              int n=nums.length;
                    for(int i=n-3;i>=0;i--){
                    if(nums[i]+nums[i+1]>nums[i+2]){
                        return nums[i]+nums[i+1]+nums[i+2] ;
                    }
                    }
               
            
        return 0;
    }
}
