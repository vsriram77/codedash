package codedash.linkedlists;

import junit.framework.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for LinkedListCycleUtil (epi8.5)
 */
public class LinkedListCycleUtilTest {
    @Test
    public void testFindCycle() throws Exception {
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
        f.setNext(d);

        Node root = LinkedListCycleUtil.findCycle(a);
        Assert.assertEquals(root, d);

        f.setNext(b);
        root = LinkedListCycleUtil.findCycle(a);
        Assert.assertEquals(root, b);


    }
}
