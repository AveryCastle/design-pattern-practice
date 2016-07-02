package chap3.template.method;

/**
 * Created by seongjuhyeon on 7/2/16.
 */
public abstract class AbstractDisplay {

    public abstract void open();

    public abstract void print();

    public abstract void close();

    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
