/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     int result = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {
        helper(root);
        return result;
    }
    public int helper(TreeNode root){
        if(root == null){
            return 0;
        }
        
        int left = helper(root.left);
        int right = helper(root.right);
        
//         case tab hoga jab we are moving in a straight path
        int max_st = Math.max(Math.max(left,right)+root.val,root.val);
//         case 2 when the node is the root
        int max_case_root = Math.max(max_st,left+right+root.val);
        
        result= Math.max(result,max_case_root);
        return max_st; 
    }
}