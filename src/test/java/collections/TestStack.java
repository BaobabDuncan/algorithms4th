package collections;

import junit.framework.TestCase;

/**
 * Created by sanguk on 08/11/2016.
 */
public class TestStack extends TestCase {
    public void testStack(){

        Stack<String> stack = new Stack<String>();
        assertTrue(stack.isEmpty());
        stack.push("a");
        assertEquals(1, stack.size());
        assertFalse(stack.isEmpty());
        stack.push("b");
        stack.push("c");
        stack.push("d");
        assertEquals("d", stack.pop());
        assertEquals("c", stack.pop());
        assertEquals(2, stack.size());
        assertEquals("b", stack.peek());
        assertEquals("b", stack.pop());
        assertEquals("a", stack.pop());
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.size());

    }
}
