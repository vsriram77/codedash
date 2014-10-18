package codedash.simple;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: vsriram
 * Date: 10/5/14
 * Time: 5:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class EngCodeTest {
    @Test
    public void testLongValue() throws Exception {
        Assert.assertEquals(EngCode.longValue("A"), 1);
        Assert.assertEquals(EngCode.longValue("z"), 26);
        Assert.assertEquals(EngCode.longValue("AA"), 27);
    }

    @Test
    public void testIsEngCode() throws Exception {
        Assert.assertEquals(EngCode.isEngCode("AA"), true);
        Assert.assertEquals(EngCode.isEngCode("A1"), false);

    }
}
