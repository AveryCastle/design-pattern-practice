package chap1.iterator.example;

import chap1.iterator.Book;
import chap1.iterator.Iterator;

/**
 * Created by seoungjuhyun on 6/30/16.
 */
public class BigBookShelfIterator implements Iterator {

    private final BigBookShelf bigBookShelf;

    private int index;

    public BigBookShelfIterator(BigBookShelf bigBookShelf) {
        this.bigBookShelf = bigBookShelf;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < bigBookShelf.getLength()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        Book book = bigBookShelf.getBookAt(index);
        index++;
        return book;
    }
}
