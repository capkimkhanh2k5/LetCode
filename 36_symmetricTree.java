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

    public boolean isSymmetric(TreeNode root) {
        return checkMirrorTree(root.left, root.right);
    }

    private boolean checkMirrorTree(TreeNode n1, TreeNode n2)
    {
        if(n1 == null && n2 == null) return true;
        if(n1 == null || n2 == null) return false;

        if(n1.val != n2.val) return false;

        return checkMirrorTree(n1.left, n2.right) && checkMirrorTree(n1.right, n2.left);
    }

    public static void main(String[] args) {
    Solution sol = new Solution();

    // Tạo cây đối xứng:
    //        1
    //      /   \
    //     2     2
    //    / \   / \
    //   3   4 4   3

    TreeNode root = sol.new TreeNode(1);
    root.left = sol.new TreeNode(2);
    root.right = sol.new TreeNode(2);
    root.left.left = sol.new TreeNode(3);
    root.left.right = sol.new TreeNode(4);
    root.right.left = sol.new TreeNode(4);
    root.right.right = sol.new TreeNode(3);

    boolean result = sol.isSymmetric(root);
    System.out.println("Is symmetric: " + result);

    // Test thêm cây không đối xứng
    //        1
    //      /   \
    //     2     2
    //      \     \
    //       3     3

    TreeNode root2 = sol.new TreeNode(1);
    root2.left = sol.new TreeNode(2);
    root2.right = sol.new TreeNode(2);
    root2.left.right = sol.new TreeNode(3);
    root2.right.right = sol.new TreeNode(3);

    boolean result2 = sol.isSymmetric(root2);
    System.out.println("Is symmetric: " + result2);
}
}