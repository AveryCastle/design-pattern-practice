package chap3.template.method.exercise;

/**
 * Created by seongjuhyeon on 7/2/16.
 */
interface AbstractDisplay {

    void open();

    void print();

    void close();

    default void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
