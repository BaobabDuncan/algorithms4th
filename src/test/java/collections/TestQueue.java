package collections;

import junit.framework.TestCase;

/**
 * Created by sanguk on 08/11/2016.
 */
public class TestQueue extends TestCase {
    public void testQueue(){

        Queue<String> queue = new Queue<String>();
        assertTrue(queue.isEmpty());
        queue.enqueue("a");
        assertEquals(1, queue.size());
        queue.enqueue("b");
        queue.enqueue("c");
        queue.enqueue("d");
        queue.enqueue("e");
        assertEquals(5, queue.size());
        assertEquals("a", queue.dequeue());
        assertEquals(4, queue.size());
        assertEquals("b", queue.dequeue());
        assertEquals("c", queue.dequeue());
        assertEquals("d", queue.dequeue());
        assertEquals("e", queue.dequeue());
        assertEquals(0, queue.size());
        assertTrue(queue.isEmpty());

        queue.enqueue("d");
        queue.enqueue("f");
        assertEquals("d", queue.peek());
        assertEquals(2, queue.size());
    }


}
