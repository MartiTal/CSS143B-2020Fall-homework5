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
        //I think in this situation a LinkedList implementation of the Queue interface is preferable to an Array
        // because a LinkedList has a dynamic size, and we don't know how large the binary tree inputs will be.

        TreeNode<Integer> pointer;
        treeNodeQueue.add(root);

        while (!treeNodeQueue.isEmpty()) {

            List<Integer> list = new LinkedList<Integer>();
            int currentsize = treeNodeQueue.size();
            //Because more nodes will be added to the Queue in the code below, we need to remember how many nodes were in it
            // initially so that we add the correct number of nodes to each new list.

            for (int i = 1; i <= currentsize; i++) {
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
