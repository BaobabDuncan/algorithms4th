package collections;

import junit.framework.TestSuite;

/**
 * Created by sanguk on 08/11/2016.
 */

public class AllTests extends TestSuite {

    public static TestSuite suite(){

        TestSuite suite = new TestSuite();
        suite.addTestSuite(TestBag.class);
        suite.addTestSuite(TestQueue.class);
        suite.addTestSuite(TestStack.class);
        return suite;

    }
}
