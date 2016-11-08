package collections;

import java.util.NoSuchElementException;

/**
 * Created by sanguk on 08/11/2016.
 */
public class Queue<Item> {
    private Node<Item> first;
    private Node<Item> last;
    private int n;



    private static class Node<Item>{
        private Item item;
        private Node<Item> next;
    }

    public Queue(){
        first = null;
        last = null;
        n = 0;
    }

    public boolean isEmpty() {
        return first==null;
    }

    public void enqueue(Item item) {
        Node<Item> oldlast = last;
        last = new Node<Item>();
        last.item = item;
        last.next = null;
        if (isEmpty()) first = last;
        else oldlast.next = last;
        n++;

    }

    public Item dequeue() {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        Item item = first.item;
        first = first.next;
        n--;
        return item;
    }

    public Item peek() {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        return first.item;
    }

    public int size() {
        return n;
    }
}
