package codedash.simple;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit tests for BinarySearcher
 */
public class BinarySearcherTest {

    @Test
    public void testFind() throws Exception {
        Assert.assertEquals(BinarySearcher.find(
                new int[]{10, 30, 33, 33, 45, 55, 69}, 33),
                2);

        Assert.assertEquals(BinarySearcher.find(
                new int[]{1, 2, 2, 5, 6, 6, 6, 9, 11, 15, 100, 333}, 6),
                4);

        Assert.assertEquals(BinarySearcher.find(
                new int[]{5, 5, 5, 10}, 5),
                0);

        Assert.assertEquals(BinarySearcher.find(
                new int[]{5, 5, 5, 5, 5,
                          5, 5, 5, 5, 5,
                          5, 5, 5, 5, 5, 10, 10, 10, 10, 10}, 10),
                15);

    }

    @Test
    public void testFind2() throws Exception {
        Assert.assertEquals(BinarySearcher.find2(
                new int[]{10, 30, 33, 33, 45, 55, 69}, 33),
                2);

        Assert.assertEquals(BinarySearcher.find2(
                new int[]{1, 2, 2, 5, 6, 6, 6, 9, 11, 15, 100, 333}, 6),
                4);

        Assert.assertEquals(BinarySearcher.find2(
                new int[]{5, 5, 5, 10}, 5),
                0);

        Assert.assertEquals(BinarySearcher.find2(
                new int[]{5, 5, 5, 5, 5,
                        5, 5, 5, 5, 5,
                        5, 5, 5, 5, 5, 10, 10, 10, 10, 10}, 10),
                15);

    }


    @Test
    public void testFindFirstGreaterThan() throws Exception {
        Assert.assertEquals(BinarySearcher.findFirstGreaterThan(
                new int[]{10, 30, 33, 33, 45, 55, 69}, 33),
                4);

        Assert.assertEquals(BinarySearcher.findFirstGreaterThan(
                new int[]{1, 2, 2, 5, 6, 6, 6, 9, 11, 15, 100, 333}, 6),
                7);

        Assert.assertEquals(BinarySearcher.findFirstGreaterThan(
                new int[]{5, 5, 5, 10}, 5),
                3);

        Assert.assertEquals(BinarySearcher.findFirstGreaterThan(
                new int[]{5, 5, 10, 10}, 10),
                -1);

        Assert.assertEquals(BinarySearcher.findFirstGreaterThan(
                new int[]{5, 5, 10, 10}, 3),
                0);

        Assert.assertEquals(BinarySearcher.findFirstGreaterThan(
                new int[]{5, 5, 5, 5, 5,
                        5, 5, 5, 5, 5,
                        5, 5, 5, 5, 5, 10, 10, 10, 10, 10}, 10),
                -1);

    }
}
