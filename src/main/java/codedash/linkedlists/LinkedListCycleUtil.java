package codedash.linkedlists;

/**
 * Find if a singly linked list contains a cycle (epi8.5)
 */
public class LinkedListCycleUtil {

    public static Node findCycle(Node root) {
        if (root == null || root.next() == null || root.next() == root) {
            return root;
        }

        Node fast = root.next();
        Node slow = root;
        while (fast != null && fast != slow && fast.next() != slow) {
            fast = fast.next();
            fast = (fast != null)? fast.next() : fast;
            slow = slow.next();
        }
        return (fast == null)? null : findCycleHead(root, slow);
    }

    public static Node findCycleHead(Node root, Node slow) {
        Node fast = slow;
        int cycleLength = 1;
        for (fast = fast.next(); fast != slow; fast = fast.next())
            cycleLength++;

        fast = root;
        for(int i = 0; i < cycleLength; i++)
            fast = fast.next();
        for (slow = root; slow != fast; slow = slow.next(), fast = fast.next())
            continue;

        return slow;
    }

}
