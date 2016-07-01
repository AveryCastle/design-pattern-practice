package chap1.iterator.example;

import chap1.iterator.Book;
import chap1.iterator.Iterator;

/**
 * Created by seoungjuhyun on 6/30/16.
 */
public class ArrayIteratorMain {

    private static final int MAX_SIZE = 4;

    private static final int EXTEND_SIZE = 5;

    public static void main(String[] args) {
        BigBookShelf bigBookShelf = new BigBookShelf(MAX_SIZE);

        for (int i = 1; i <= MAX_SIZE + EXTEND_SIZE; i++) {
            bigBookShelf.appendBook(new Book("Book_" + i));
        }

        Iterator iterator = bigBookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
