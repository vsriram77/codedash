package codedash.linkedlists;

/**
 * Reverse a singly linked list (epi8.2)
 */
public class LinkedListReverseUtil {

    public static Node reverse(Node root) {
        if (root == null || root.next() == null) {
            return root;
        }

        Node pivot = root.next();
        while (pivot != null) {
            Node temp = pivot.next();
            pivot.setNext(root);
            root = pivot;
            pivot = temp;
        }

        return root;
    }

}
