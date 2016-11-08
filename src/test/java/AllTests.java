import junit.framework.TestSuite;

/**
 * Created by sanguk on 08/11/2016.
 */
public class AllTests {
    public static TestSuite suite(){
        TestSuite suite = new TestSuite();
        suite.addTest(collections.AllTests.suite());
        suite.addTest(sorts.AllTests.suite());
        return suite;
    }
}
