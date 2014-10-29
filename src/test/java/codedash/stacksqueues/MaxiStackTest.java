package codedash.stacksqueues;

import codedash.stacksqueues.MaxiStack;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit tests for MaxiStack
 */
public class MaxiStackTest {

    @Test
    public void testMax() throws Exception {
        MaxiStack ms = new MaxiStack();
        ms.add(10).add(40).add(20).add(39).add(5);
        Assert.assertEquals(ms.max(), 40);
    }

    @Test
    public void testPop() throws Exception {
        MaxiStack ms = new MaxiStack();
        ms.add(10).add(40).add(20).add(39).add(5);
        Assert.assertEquals(ms.pop(), 5);
        Assert.assertEquals(ms.pop(), 39);
        Assert.assertEquals(ms.pop(), 20);
        Assert.assertEquals(ms.pop(), 40);
        Assert.assertEquals(ms.pop(), 10);

    }
}
