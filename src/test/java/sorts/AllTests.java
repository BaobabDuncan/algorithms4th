package sorts;

import collections.TestQueue;
import junit.framework.TestSuite;

/**
 * Created by sanguk on 08/11/2016.
 */
public class AllTests extends TestSuite {
    public static TestSuite suite(){
        TestSuite suite = new TestSuite();
        suite.addTestSuite(TestSelection.class);
        suite.addTestSuite(TestInsertion.class);
        suite.addTestSuite(TestShell.class);
        suite.addTestSuite(TestMerge.class);
        suite.addTestSuite(TestMergeX.class);
        suite.addTestSuite(TestQuick.class);
        suite.addTestSuite(TestQuickX.class);
        return suite;
    }
}
