
 Binary Tree Postorder Traversal

Given the root of a binary tree, return the postorder traversal of its nodes' values.

 

Example 1:


Input: root = [1,null,2,3]
Output: [3,2,1]
Example 2:

Input: root = []
Output: []
Example 3:

Input: root = [1]
Output: [1]
 

Constraints:

The number of the nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
 ===================================================================================================================================================================
 JAVA SOLUTION
class Solution {
    List<Integer> list= new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
        postorder(root);
        return list;
    }
    public void postorder(TreeNode root){
        if(root==null){
            return ;
        }
        postorder(root.left);
        postorder(root.right);
        list.add(root.val);
        
    }
}
