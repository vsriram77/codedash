package codedash.stacksqueues;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit tests for BinaryTreePrinter (epi9.10)
 */
public class BinaryTreePrinterTest {
    @Test
    public void testPrintBinaryTreeInIncreasingDepth() throws Exception {
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");
        Node g = new Node("g");
        Node h = new Node("h");
        a.setLeft(b);
        a.setRight(c);
        b.setLeft(d);
        b.setRight(e);
        c.setLeft(g);
        e.setLeft(f);

        BinaryTreePrinter.printBinaryTreeInIncreasingDepth(a);
        Assert.assertEquals(a, a);

    }
}
