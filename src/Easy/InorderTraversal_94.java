package Easy;

import java.util.ArrayList;
import java.util.LinkedList;
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
        List<Integer> l1 = new ArrayList<>();

        helper(root, l1);

        return l1;
    }

    public void helper(TreeNode root, List<Integer> list){
        if (root != null) {
            helper(root.left, list);
            list.add(root.val);
            helper(root.right, list);
        }
    }

    public static void main(String[] args) {
        TreeNode t3 = new TreeNode(3);
        TreeNode t2 = new TreeNode(2, t3, null);
        TreeNode t1 = new TreeNode(1, null, t2);
        InorderTraversal_94 obj = new InorderTraversal_94();

        System.out.println(obj.inorderTraversal(t1));
//        List<Integer> l1 = new ArrayList<>();
//
//        l1 = obj.inorderTraversal(t1);
//        System.out.println(l1);
//        for (int i : l1) {
//            System.out.println(i);
//        }
    }
}
