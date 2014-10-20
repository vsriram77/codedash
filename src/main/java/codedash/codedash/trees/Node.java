package codedash.codedash.trees;

/**
 * Binary tree node
 */
public class Node {
    private String label;
    private Node left;
    private Node right;

    public Node(String label) {
        this.label = label;
        this.left = null;
        this.right = null;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}
