package chap4.factory.method.exercise.idcard;

import static org.junit.Assert.assertFalse;

import chap4.factory.method.exercise.framework.Factory;
import chap4.factory.method.exercise.framework.Product;
import org.junit.Test;

/**
 * Created by seoungjuhyun on 7/5/16.
 */
public class IDCardFactoryTest {

    @Test
    public void createProductWithDifferentSerialCode() {
        Factory factory = new IDCardFactory();
        Product product1 = factory.create("홍길동");
        Product product2 = factory.create("홍길동");

        assertFalse(product1.use().equals(product2.use()));
    }
}
