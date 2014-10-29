package codedash.arrays;

import codedash.arrays.MaxDiffFinder;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit tests for MaxDiffFinder
 */
public class MaxDiffFinderTest {

    @Test
    public void testFindLargestSum() throws Exception {
        Assert.assertEquals(MaxDiffFinder.findLargestSum(
                // { 0, 30, 20, 50, 0 }
                new int[]{30, -10, 30, -50}),
                50);

        Assert.assertEquals(MaxDiffFinder.findLargestSum(
                // { 0, 30, -10, 40, 30, 50, 60, 40, 10, 0 }
                new int[]{ 30, -40, 50, -10, 20, 10, -20, -30, -10 }),
                70);

        Assert.assertEquals(MaxDiffFinder.findLargestSum(
                new int[]{ 5, 3, -10, 4, 8, 12, -10, 20, -60 }),
                34);
    }

    @Test
    public void testFindMaxDiff() throws Exception {
        Assert.assertEquals(MaxDiffFinder.findMaxDiff(
                // { 30, -10, 30, -50 }
                new int[] { 0, 30, 20, 50, 0 }),
                50);

        Assert.assertEquals(MaxDiffFinder.findMaxDiff(
                new int[] { 0, 30, -10, 40, 30, 50, 60, 40, 10, 0 }),
                // { 30, -40, 50, -10, 20, 10, -20, -30, -10 }),
                70);

    }

}
