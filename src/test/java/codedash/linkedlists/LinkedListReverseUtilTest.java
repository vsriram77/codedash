package codedash.linkedlists;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 */
public class LinkedListReverseUtilTest {
    @Test
    public void testReverse() throws Exception {
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");

        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
        d.setNext(e);
        e.setNext(f);

        Node root = LinkedListReverseUtil.reverse(a);
        Assert.assertEquals(root.getValue(), "f");
        Assert.assertEquals(root.getNext(), e);
        Assert.assertEquals(root.getNext().getNext(), d);
        Assert.assertEquals(root.getNext().getNext().getNext(), c);
        Assert.assertEquals(root.getNext().getNext().getNext().getNext(), b);
        Assert.assertEquals(root.getNext().getNext().getNext().getNext().getNext(), a);



    }
}
