package chap2.adapter.v1;

/**
 * PrintBanner 클래스.
 * Adapter(개조하는 쪽)의 역할.
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithStar();
    }
}
