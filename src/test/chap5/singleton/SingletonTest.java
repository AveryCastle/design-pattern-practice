package chap5.singleton;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Created by seoungjuhyun on 7/5/16.
 */
public class SingletonTest {

    @Test
    public void createOnlyOneInstance() {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        assertTrue(singleton1 == singleton2);
        assertTrue(singleton1.equals(singleton2));
    }
}
