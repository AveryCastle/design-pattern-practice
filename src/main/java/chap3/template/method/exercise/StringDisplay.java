package chap3.template.method.exercise;

/**
 * Created by seongjuhyeon on 7/2/16.
 */
public class StringDisplay implements AbstractDisplay {

    private final String string;

    private int width;

    public StringDisplay(String string) {
        this.string = string;
        width = string.getBytes().length;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    // TODO: 한글은 2Byte로 인식해서 실제 line을 print할 때, 글자길이와 딱 맞아떨어지도록 print되게 해야 함.
    private void printLine() {
        System.out.print("+");

        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }

        System.out.println("+");
    }
}
