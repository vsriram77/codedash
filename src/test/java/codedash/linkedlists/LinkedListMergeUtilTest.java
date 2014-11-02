package codedash.linkedlists;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit tests for LinkedListMergeUtil (epi8.1)
 */
public class LinkedListMergeUtilTest {

    @Test
    public void testMergeSortedLists() throws Exception {

        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");

        a.setNext(c);
        c.setNext(e);

        b.setNext(d);
        d.setNext(f);

        Node root = LinkedListMergeUtil.mergeSortedLists(a, b);
        Assert.assertEquals(root.getValue(), "a");
        Assert.assertEquals(root.getNext(), b);
        Assert.assertEquals(root.getNext().getNext(), c);
        Assert.assertEquals(root.getNext().getNext().getNext(), d);
        Assert.assertEquals(root.getNext().getNext().getNext().getNext(), e);
        Assert.assertEquals(root.getNext().getNext().getNext().getNext().getNext(), f);
    }

    @Test
    public void testMergeSortedLists2() throws Exception {

        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");

        a.setNext(c);
        c.setNext(e);

        b.setNext(d);
        d.setNext(f);

        Node root = LinkedListMergeUtil.mergeSortedLists2(a, b);
        Assert.assertEquals(root.getValue(), "a");
        Assert.assertEquals(root.getNext(), b);
        Assert.assertEquals(root.getNext().getNext(), c);
        Assert.assertEquals(root.getNext().getNext().getNext(), d);
        Assert.assertEquals(root.getNext().getNext().getNext().getNext(), e);
        Assert.assertEquals(root.getNext().getNext().getNext().getNext().getNext(), f);
    }

}
