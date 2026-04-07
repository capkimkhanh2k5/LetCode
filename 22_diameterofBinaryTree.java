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
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private int  maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        calculatorMax(root);
        
        return maxDiameter;
    }

    private int calculatorMax(TreeNode root)
    {
        if(root == null) return 0;

        int l = calculatorMax(root.left);
        int r = calculatorMax(root.right);

        maxDiameter = Math.max(maxDiameter, l + r);

        return Math.max(l , r) + 1;
    }
}