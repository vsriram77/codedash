package codedash.arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 */
public class LongestSubArrayOfEqualsFinderTest {
    @Test
    public void testLengthOfLongestSubArray() throws Exception {
        int [] input1 = {
                1, 1, 1,
                3, 3,
                5, 5, 5, 5, 5, 5};
        Assert.assertEquals(LongestSubArrayOfEqualsFinder.lengthOfLongestSubArray(input1), 6);

        int [] input2 = {
                1, 1, 1, 1, 1,
                3, 3,
                5};
        Assert.assertEquals(LongestSubArrayOfEqualsFinder.lengthOfLongestSubArray(input2), 5);

        int [] input3 = {
                1, 1, 1
        };
        Assert.assertEquals(LongestSubArrayOfEqualsFinder.lengthOfLongestSubArray(input3), 3);

    }
}
