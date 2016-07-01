package chap2.adapter.v2;

/**
 * Main 클래스. 프로그램 시작지점.
 * Client(의뢰자)의 역할.
 */
public class V2Main {

    public static void main(String[] args) {
        Print p = new PrintBanner("V2 Hello");

        p.printWeak();
        p.printStrong();
    }
}
