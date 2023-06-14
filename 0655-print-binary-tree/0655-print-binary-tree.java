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
    public List<List<String>> printTree(TreeNode root) {
      int height = getHeight(root);
      int width = (int)Math.pow(2,height)-1;
      String[][] matrix = new String[height][width];
      for(String[] r : matrix){
          Arrays.fill(r,"");
      }
      List<List<String>> list = new ArrayList<>();
      getBinary(matrix, root, 0, 0, width-1);
      for(String[] r : matrix){
          list.add(Arrays.asList(r));
      }
      return list;
    }
    public void getBinary(String[][] matrix, TreeNode root, int row, int left, int right){
        if(root == null) return;
        int mid = left + (right - left)/2;
        matrix[row][mid] = String.valueOf(root.val);
        getBinary(matrix, root.left, row+1, left, mid-1);
        getBinary(matrix, root.right, row+1, mid+1, right);
    }
    public int getHeight(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
}