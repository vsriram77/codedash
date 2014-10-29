package codedash.strings;

import codedash.strings.StringNumber;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit tests for StringNumber
 */
public class StringNumberTest {

    @Test
    public void testIntValue() throws Exception {
        Assert.assertEquals(new StringNumber("123").intValue(), 123);
        Assert.assertEquals(new StringNumber("-32355").intValue(), -32355);
        Assert.assertEquals(new StringNumber("0").intValue(), 0);
        Assert.assertEquals(new StringNumber(" -1").intValue(), -1);
    }

    @Test
    public void testInt2String() throws Exception {
        Assert.assertEquals(new StringNumber(123).intValue(), 123);
        Assert.assertEquals(new StringNumber(-32355).intValue(), -32355);
        Assert.assertEquals(new StringNumber(0).intValue(), 0);
        Assert.assertEquals(new StringNumber( -1).intValue(), -1);

        Assert.assertEquals(new StringNumber(123).toString(), "123");
        Assert.assertEquals(new StringNumber(-123).toString(), "-123");
        Assert.assertEquals(new StringNumber(0).toString(), "0");

    }

}
