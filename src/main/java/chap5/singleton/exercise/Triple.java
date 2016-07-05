package chap5.singleton.exercise;

/**
 * 서로 다른 Instance를 최대 3개까지만 생성하는 Triple 클래스.
 */
public class Triple {

    private int id = 0;

    private static Triple[] triples =
            {new Triple(0), new Triple(1), new Triple(3)};

    private Triple(int id) {
        this.id = id;
    }

    public static Triple getInstance(int id) {
        return triples[id];
    }
}
