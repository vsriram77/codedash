package codedash.strings;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit tests for PatternApplierABDD (epi7.2)
 */
public class PatternApplierABDDTest {
    @Test
    public void testFindAndReplaceABDD() throws Exception {
        String a = PatternApplierABDD.findAndReplaceABDD("cabacc");
        Assert.assertEquals(a, "cddddcc");

    }

    @Test
    public void testGetFinalLengthABDD() throws Exception {
        Assert.assertEquals(PatternApplierABDD.getFinalLengthABDD("cabacc"), 7);

    }
}
