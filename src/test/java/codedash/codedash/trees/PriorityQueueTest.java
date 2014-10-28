package codedash.codedash.trees;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityQueueTest {
    @Test
    public void testExtractMin() throws Exception {
        PriorityQueue pq = new PriorityQueue(8);
        pq.insert(10);
        pq.insert(3);
        pq.insert(12);
        pq.insert(5);
        pq.insert(8);
        pq.insert(15);
        Assert.assertEquals(pq.extractMin(), 3);
        Assert.assertEquals(pq.extractMin(), 5);
        Assert.assertEquals(pq.extractMin(), 8);
        Assert.assertEquals(pq.extractMin(), 10);
        Assert.assertEquals(pq.extractMin(), 12);
        Assert.assertEquals(pq.extractMin(), 15);

    }

}
