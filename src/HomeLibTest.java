import junit.framework.TestCase;

public class HomeLibTest extends TestCase {

    HomeLib mHomeLib;

    public HomeLibTest(String name) {
        super(name);
    }

    @Override
    protected void setUp() throws Exception {
        mHomeLib = new HomeLib();
        System.out.println("JUnit setup is running before each test");
    }

    @Override
    protected void tearDown() throws Exception {
    }

    public void testPalindrome() {

        // WHEN THE STRING IS A PALINDROME
        String pStr = "Malayalam";

        boolean pExpectedResult = true;
        boolean pActualResult = mHomeLib.checkIfStringIsPalindrome(pStr);
        assertEquals(pExpectedResult, pActualResult);


        // WHEN THE STRING IS NOT A PALINDROME
        String npStr = "English";

        boolean npExpectedResult = false;
        boolean npActualResult = mHomeLib.checkIfStringIsPalindrome(npStr);
        assertEquals(npExpectedResult, npActualResult);
    }

    public void testSimpleSum() {

        int a = 4;
        int b = 3;
        int expectedSum = 7;
        int actualSub = mHomeLib.getSumOf(a, b);
        assertEquals(expectedSum, actualSub);
    }

    public void testSimple() {
        mHomeLib.printTest1();
    }
}