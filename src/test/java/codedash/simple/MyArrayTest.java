package codedash.simple;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * MyArray Tests
 */
public class MyArrayTest {

    private MyArray ma;
    @BeforeClass
    public void setup() {
        this.ma = new MyArray(10);
        ma.add("aa");
        ma.add("bb");
        ma.add("cc");

    }

    @Test
    public void testAdd() throws Exception {
        Assert.assertEquals("aa", ma.get(0));
        Assert.assertEquals("bb", ma.get(1));
        Assert.assertEquals("cc", ma.get(2));
    }

    @Test
    public void testDelete() throws Exception {
        ma.delete("bb");
        Assert.assertEquals(ma.get(0), "aa");
        Assert.assertEquals(ma.get(1), "cc");
    }
}
