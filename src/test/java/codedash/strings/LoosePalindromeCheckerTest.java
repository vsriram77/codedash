package codedash.strings;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit tests for LoosePalindromeChecker (epi7.3)
 */
public class LoosePalindromeCheckerTest {
    @Test
    public void testIsPalindrome() throws Exception {
        Assert.assertEquals(LoosePalindromeChecker.isPalindrome("abbba"), true);
        Assert.assertEquals(LoosePalindromeChecker.isPalindrome("able was I, ere I saw elba!"), true);

    }

    @Test
    public void testForwardToAlphaNumeric() throws Exception {
        Assert.assertEquals(LoosePalindromeChecker.forwardToAlphaNumeric(";.jdd dd ", 0), 2);
        Assert.assertEquals(LoosePalindromeChecker.forwardToAlphaNumeric(";.jdd dd ", 1), 2);
        Assert.assertEquals(LoosePalindromeChecker.forwardToAlphaNumeric(";.j--dd ", 3), 5);
    }

    @Test
    public void testReverseToAlphaNumeric() throws Exception {
        Assert.assertEquals(LoosePalindromeChecker.reverseToAlphaNumeric(
                "dd.;",
                "dd.;".length()-1), 1);
        Assert.assertEquals(LoosePalindromeChecker.reverseToAlphaNumeric(
                "d...d...d",
                3), 0);
    }
}
