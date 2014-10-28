package codedash.trees;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit tests for BalancedTreeCheckerTest
 */
public class BalancedTreeCheckerTest {

    @Test
    public void testIsBinaryTreeBalanced() throws Exception {
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

        Assert.assertEquals(BalancedTreeChecker.isBinaryTreeBalanced(a), true);

        f.setLeft(h);
        Assert.assertEquals(BalancedTreeChecker.isBinaryTreeBalanced(a), false);

        f.setLeft(null);
        a.setRight(null);
        Assert.assertEquals(BalancedTreeChecker.isBinaryTreeBalanced(a), false);

        a.setLeft(null);
        a.setRight(null);
        Assert.assertEquals(BalancedTreeChecker.isBinaryTreeBalanced(a), true);

    }

    @Test
    public void testIsBinaryTreeBalanced2() throws Exception {
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");
        Node g = new Node("g");
        a.setLeft(b);
        b.setLeft(c);
        a.setRight(d);
        d.setRight(e);
        e.setRight(f);
        d.setLeft(g);

        Assert.assertEquals(BalancedTreeChecker.isBinaryTreeBalanced(a), true);
    }

}
