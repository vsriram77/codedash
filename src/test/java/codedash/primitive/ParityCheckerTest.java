package codedash.primitive;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit tests for ParityChecker
 */
public class ParityCheckerTest {

    @Test
    public void testCheckParity() throws Exception {
        Assert.assertEquals(ParityChecker.checkParity(1), 1);
        Assert.assertEquals(ParityChecker.checkParity(0b11001), 1);
        Assert.assertEquals(ParityChecker.checkParity(0b111), 1);
        Assert.assertEquals(ParityChecker.checkParity(0b1111000111000), 1);
        Assert.assertEquals(ParityChecker.checkParity(0b10000001001), 1);

        Assert.assertEquals(ParityChecker.checkParity(0), 0);
        Assert.assertEquals(ParityChecker.checkParity(0b110011), 0);
        Assert.assertEquals(ParityChecker.checkParity(0b1111), 0);
        Assert.assertEquals(ParityChecker.checkParity(0b11110001110001), 0);
        Assert.assertEquals(ParityChecker.checkParity(0b100000010011), 0);
    }
}
