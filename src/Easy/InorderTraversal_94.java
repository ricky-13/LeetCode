package Easy;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class InorderTraversal_94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List l1 = new ArrayList();

        if (root != null) {
            inorderTraversal(root.left);
            l1.add(root.val);
            inorderTraversal(root.right);
        }

        return l1;
    }
}
