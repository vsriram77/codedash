package misc.datastructures;

import misc.datastructures.MyArray;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * MyArray Tests
 */
public class MyArrayTest {

    private MyArray ma;
    @BeforeMethod
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
    public void testDeleteFirst() throws Exception {
        int idx = ma.deleteFirst("bb");
        Assert.assertEquals(idx, 1);
        Assert.assertEquals(ma.get(0), "aa");
        Assert.assertEquals(ma.get(1), "cc");
    }

    @Test
    public void testDeleteAll() throws Exception {
        ma.add("bb");
        int numDeleted = ma.deleteAll("bb");
        Assert.assertEquals(numDeleted, 2);
        Assert.assertEquals(ma.get(0), "aa");
        Assert.assertEquals(ma.get(1), "cc");
    }

}
