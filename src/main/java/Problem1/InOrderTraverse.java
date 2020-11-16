package Problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraverse {
    public static List<Integer> inorderTraversalIterative(TreeNode<Integer> root) {
        // homework
        List<Integer> result = new ArrayList<>();

        //if (root == null)
        //    return result;

        //I didn't forget to write this, it just became no longer necessary

        TreeNode<Integer> pointer = root;
        Stack<TreeNode> treeNodeStack = new Stack<>();

        treeNodeStack.push(null); //Add a null element to the stack so while loop will actually run

        while (!treeNodeStack.isEmpty()) {

            if (pointer == null) {

                pointer = treeNodeStack.pop();
                if (pointer != null) { //This is to prevent a NullPointerException when the final null value in the stack is popped
                    result.add(pointer.val);
                    pointer = pointer.right;
                }

            } else { //Continue to check for nodes in the left direction until we stumble across null
                treeNodeStack.push(pointer);
                pointer = pointer.left;
            }

        }
        return result;  // place holder
    }
}
