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

    private int maxdepth = 0;

    public int maxDepth(TreeNode root) {
        calculatorMax(root, 1);
        return maxdepth;
    }

    private void calculatorMax(TreeNode node, int count)
    {
        if(node == null) return;

        maxdepth = Math.max(maxdepth, count);

        calculatorMax(node.left, count + 1);
        calculatorMax(node.right, count + 1);
    }

    // ===== MAIN TEST =====
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Tạo cây:
        //        1
        //       / \
        //      2   3
        //     /
        //    4

        TreeNode root = sol.new TreeNode(1);
        root.left = sol.new TreeNode(2);
        root.right = sol.new TreeNode(3);
        root.left.left = sol.new TreeNode(4);

        int result = sol.maxDepth(root);

        System.out.println("Max depth = " + result);
    }
}