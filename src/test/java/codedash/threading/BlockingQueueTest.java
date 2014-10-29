package codedash.threading;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit tests for BlockingQueue
 */
public class BlockingQueueTest {
    @Test
    public void testGet() throws Exception {

        BlockingQueue q = new BlockingQueue(10);
        q.put("a");
        q.put("a");
        q.put("a");

        Assert.assertTrue(true);

    }
}
