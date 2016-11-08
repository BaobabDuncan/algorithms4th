package collections;

import utils.StdIn;
import utils.StdOut;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * Created by sanguk on 08/11/2016.
 */
public class Bag<Item> implements Iterable<Item> {

    private Node<Item> first;
    private int n;

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator<Item>(first);
    }

    private class ListIterator<Item> implements Iterator<Item> {
        private  Node<Item> current;

        public ListIterator(Node<Item> first){
            current = first;
        }

        @Override
        public boolean hasNext() {
            return current!= null;
        }

        @Override
        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }


    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }

    public Bag(){
        first = null;
        n = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void add(Item item){
        Node<Item> oldfirst = first;
        first = new Node<Item>();
        first.item = item;
        first.next = oldfirst;
        n++;
    }

    public int size(){
        return n;
    }

}
