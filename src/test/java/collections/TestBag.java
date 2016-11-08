package collections;

import junit.framework.TestCase;
import utils.StdOut;

/**
 * Created by sanguk on 08/11/2016.
 */
public class TestBag extends TestCase {
    public void testBag(){

        Bag<String> bag = new Bag<String>();
        assertTrue(bag.isEmpty());
        bag.add("a");
        assertEquals(1, bag.size());
        assertFalse(bag.isEmpty());
        bag.add("b");
        bag.add("c");
        bag.add("d");
        bag.add("e");
        bag.add("f");

        for (String s : bag) {
            StdOut.println(s);
        }
    }
}
