package codedash.binarytrees;

/**
 * Check whether a given binary tree is balanced
 */
public class BalancedTreeChecker {

    public static boolean isBinaryTreeBalanced(Node root) {
        int leftHeight = getHeight(root.getLeft());
        int rightHeight = getHeight(root.getRight());
        if (leftHeight == -2 || rightHeight == -2) {
            return false;
        }

        return (Math.abs(leftHeight - rightHeight) <= 1)? true: false;
    }

    public static int getHeight(Node node) {
        if (node == null) {
            return -1;
        }

        int leftHeight = getHeight(node.getLeft());
        int rightHeight = getHeight(node.getRight());
        if (leftHeight == -2 || rightHeight == -2) {
            return -2;
        }

        return (Math.abs(leftHeight - rightHeight) <= 1)?
                Math.max(leftHeight, rightHeight) + 1: -2;
    }
}
