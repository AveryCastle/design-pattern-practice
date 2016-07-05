package chap5.singleton;

/**
 * 인스턴스를 1개만 만드는 Singleton 클래스.
 */
public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("created a singlton.");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
