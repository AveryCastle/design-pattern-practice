package chap1.iterator.example;

import chap1.iterator.Aggregate;
import chap1.iterator.Book;
import chap1.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by seoungjuhyun on 6/30/16.
 */
public class BigBookShelf implements Aggregate {

    private List<Book> books;

    public BigBookShelf(int initialsize) {
        books = new ArrayList<Book>(initialsize);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator iterator() {
        return new BigBookShelfIterator(this);
    }
}
