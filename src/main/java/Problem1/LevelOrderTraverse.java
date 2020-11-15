package Problem1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//I was influenced by the tree traversal algorithm reference that was sent in the Discord:
//https://towardsdatascience.com/4-types-of-tree-traversal-algorithms-d56328450846
//There is example code that demonstrates how to use a Queue for this level-order traversal.


public class LevelOrderTraverse {
    public static List<List<Integer>> levelOrder(TreeNode<Integer> root) {
        // homework
        List<List<Integer>> result = new ArrayList<>();

        if (root == null)
            return result;

        Queue<TreeNode> treeNodeQueue = new LinkedList<TreeNode>();
        //I think in this situation a LinkedList is preferable to an Array because of its dynamic size.
        TreeNode<Integer> pointer;
        treeNodeQueue.add(root);

        while (!treeNodeQueue.isEmpty()) {

            List<Integer> list = new LinkedList<Integer>();
            int currentsize = treeNodeQueue.size();

            for (int i = 0; i <= currentsize; i++) {
                pointer = treeNodeQueue.poll();
                list.add(pointer.val);

                if (pointer.left != null) {
                    treeNodeQueue.add(pointer.left);
                }
                if (pointer.right != null) {
                    treeNodeQueue.add(pointer.right);
                }
            }

            result.add(list);

        }

        return result;  // place holder
    }
}
