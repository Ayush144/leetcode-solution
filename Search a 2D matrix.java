Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
 

Example 1:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
Example 2:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-104 <= matrix[i][j], target <= 104
======================================================================================================================================================================
JAVA SOLUTION

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int row=matrix.length;
        int col =matrix[0].length;
        int low=0;
        int high = row*col;
        while(low<high){
        int mid= low + (high-low)/2;
            int elerow = mid/col;
            int elecol= mid%col;
        if(matrix[elerow][elecol]==target){
            return true;
        }
            else if(matrix[elerow][elecol]>target){
           high=mid;
        }
            else{
                low=mid+1;
            }
        }
        return false;
    }
}
