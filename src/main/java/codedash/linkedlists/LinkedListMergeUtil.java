package codedash.linkedlists;

/**
 * merge two sorted linked lists (epi8.1)
 *
 */
public class LinkedListMergeUtil {


    public static Node mergeSortedLists2(Node a, Node b) {
        Node result = null;
        Node prev = null;
        while (a != null && b != null) {
            Node upNext = (a.value().compareTo(b.value()) < 0)? a : b;
            if (a.value().compareTo(b.value()) < 0) {
                a = a.next();
            } else {
                b = b.next();
            }

            if (prev == null) {
                result = upNext;
            } else {
                prev.setNext(upNext);
            }
            prev = upNext;
        }
        if (a != null) {
            prev.setNext(a);
        }
        if (b != null) {
            prev.setNext(b);
        }

        return result;
    }

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
