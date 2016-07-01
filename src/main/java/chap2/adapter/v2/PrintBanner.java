package chap2.adapter.v2;

/**
 * PrintBanner 클래스.
 * Adapter(개조하는 쪽)의 역할.
 */
public class PrintBanner extends Print {

    private Banner banner;

    public PrintBanner(String string) {
        banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithStar();
    }
}
