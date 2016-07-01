package chap2.adapter.v2;

/**
 * Banner 클래스.
 * 제공되고 있는 것. Adaptee(개조되는 것)의 역할.
 */
public class Banner {

    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithStar() {
        System.out.println("*" + string + "*");
    }
}
