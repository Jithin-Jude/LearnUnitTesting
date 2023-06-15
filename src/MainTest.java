import junit.framework.TestCase;

public class MainTest extends TestCase {
    Main mLib;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mLib = new Main();
        System.out.println("JUnit setup is running before each test");
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGetSumOf() {

        int a = 4;
        int b = 3;
        int expectedSum = 7;
        int actualSub = mLib.getSumOf(a, b);
        assertEquals(expectedSum, actualSub);
    }
}