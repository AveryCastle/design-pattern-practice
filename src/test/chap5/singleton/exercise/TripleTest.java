package chap5.singleton.exercise;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Created by seoungjuhyun on 7/5/16.
 */
public class TripleTest {

    @Test
    public void createTripleInstanceUpToThree() {
        Triple triple1 = Triple.getInstance(0);
        Triple triple2 = Triple.getInstance(0);
        Triple triple3 = Triple.getInstance(1);
        Triple triple4 = Triple.getInstance(2);

        assertTrue(triple1 == triple2);
        assertTrue(triple1.equals(triple2));

        assertTrue(triple1 != triple3);
        assertTrue(triple3 != triple4);
    }
}
