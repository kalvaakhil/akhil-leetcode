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
    List<String> li = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        
        helper(root, "");
        for(int i=0;i<li.size();i++)
        li.set(i, li.get(i).substring(2));
        return li;
    }
    void helper(TreeNode root , String curr)
    {
        if(root == null)
        return;

        if(root.left == null && root.right == null)
        li.add(curr + "->" + root.val );
        
        helper(root.left, curr + "->" + root.val);
        helper(root.right, curr + "->" + root.val);
    }
}