package codedash.arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * unit tests for BatteryEstimator (epi6.8)
 */
public class BatteryEstimatorTest {
    @Test
    public void testEstimateCapacityRequired() throws Exception {
        int [] input1 = {0, 30, 10, 20, 40, 20, 30};
        Assert.assertEquals(BatteryEstimator.estimateCapacityRequired(input1), 40);

        int [] input2 = {0, 30, -10, 20, 40, 20, 30};
        Assert.assertEquals(BatteryEstimator.estimateCapacityRequired(input2), 50);

        int [] input3 = {0, 30, 10, 20, 40, -30, 30, 20};
        Assert.assertEquals(BatteryEstimator.estimateCapacityRequired(input3), 60);

    }
}
