package chap2.adapter.v1;

/**
 * Main 클래스. 프로그램 시작지점.
 * Client(의뢰자)의 역할.
 */
public class V1Main {

    public static void main(String[] args) {
        Print p = new PrintBanner("V1 Hello");

        p.printWeak();
        p.printStrong();
    }
}
