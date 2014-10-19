package codedash.lists;

/**
 * merge two sorted linked list
 * 15m+5m+...
 */
public class LinkedListMergeUtil {

    public static Node mergeSortedLists(Node a, Node b) {
        Node root = null;
        if (a != null && b != null && (a.getValue().compareTo(b.getValue()) < 0)) {
            root = a;
            a = a.getNext();
        } else if (a != null && b != null && (a.getValue().compareTo(b.getValue()) >= 0)) {
            root = b;
            b = b.getNext();
        }
        Node curr = root;

        while (a != null && b != null) {
            if (a.getValue().compareTo(b.getValue()) < 0) {
                curr.setNext(a);
                a = a.getNext();
            } else {
                curr.setNext(b);
                b = b.getNext();
            }
            curr = curr.getNext();
        }

        if (a != null) {
            curr.setNext(a);
        }

        if (b != null) {
            curr.setNext(b);
        }

        return root;
    }
}
