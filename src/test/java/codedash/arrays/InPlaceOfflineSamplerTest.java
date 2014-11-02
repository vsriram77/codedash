package codedash.arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * unit test for InPlaceOfflineSampler (epi6.16)
 */
public class InPlaceOfflineSamplerTest {
    @Test
    public void testDoSampling() throws Exception {
        int [] input1 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        InPlaceOfflineSampler.doSampling(input1, 3);
        Assert.assertTrue(input1.length > 0);

    }
}
