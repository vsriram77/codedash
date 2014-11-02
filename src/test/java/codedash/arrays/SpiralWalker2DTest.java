package codedash.arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * unit test for SpiralWalker2D (epi6.22)
 */
public class SpiralWalker2DTest {
    @Test
    public void testDoSpiralWalk() throws Exception {
        int [][] matrix3 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> actual = SpiralWalker2D.doSpiralWalk(matrix3);
        List<Integer> expected = Arrays.asList(new Integer[]{1, 2, 3, 6, 9, 8, 7, 4, 5});

        Assert.assertEquals(actual, expected);

        int [][] matrix5 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        List<Integer> actual5 = SpiralWalker2D.doSpiralWalk(matrix5);
        List<Integer> expected5 = Arrays.asList(new Integer[]{
                1, 2, 3, 4, 5, 10, 15, 20, 25, 24, 23, 22, 21, 16, 11, 6,
                7, 8, 9, 14, 19, 18, 17, 12, 13
        });

        Assert.assertEquals(actual5, expected5);

    }
}
