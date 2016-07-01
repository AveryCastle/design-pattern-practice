package chap1.iterator;

/**
 * Created by seongjuhyeon on 6/29/16.
 */
public class IteratorMain {

    public static final int MAX_SIZE = 4;

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(MAX_SIZE);

        for (int i = 1; i <= MAX_SIZE; i++) {
            bookShelf.appendBook(new Book("Book_" + i));
        }

        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
