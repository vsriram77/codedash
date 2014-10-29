package codedash.arrays;

import codedash.arrays.PivotedPartitioner;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit tests for PivotedPartitioner
 */
public class PivotedPartitionerTest {

    @Test
    public void testPartition() throws Exception {
        int [] input2 = { 10, 10, 10, 5, 10, 3};
        PivotedPartitioner.partition(input2, 3);
        Assert.assertEquals(input2[1], 5);

        int [] input1 = { 10, 1, 3, 6, 8};
        PivotedPartitioner.partition(input1, 3);
        Assert.assertEquals(input1[2], 6);

        int [] input3 = { 10, 100, 20, 33, 4};
        PivotedPartitioner.partition(input3, 3);
        Assert.assertEquals(input3[2], 20);

        int [] input4 = { 1, 10, 100, 200};
        PivotedPartitioner.partition(input4, 0);
        Assert.assertEquals(input4[0], 1);

        int [] input5 = { 1, 10, 100, 200};
        PivotedPartitioner.partition(input4, 3);
        Assert.assertEquals(input4[3], 200);

    }

    private void printArray(int[] a) {
        for (int i : a) {
            System.out.println("i="+i);
        }
    }
}
