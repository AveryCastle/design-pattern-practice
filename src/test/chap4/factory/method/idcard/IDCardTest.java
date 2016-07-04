package chap4.factory.method.idcard;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import chap4.factory.method.framework.Factory;
import chap4.factory.method.framework.Product;
import org.junit.Test;

/**
 * IDCard 테스트.
 */
public class IDCardTest {

    private static final String USING_MESSAGE = "의 카드를 사용 중입니다.";

    @Test
    public void createIDCard() {
        Factory factory = new IDCardFactory();

        Product iDCard1 = factory.create("홍길동");
        assertThat(iDCard1.use(), equalTo("홍길동" + USING_MESSAGE));

        Product iDCard2 = factory.create("하니");
        assertThat(iDCard2.use(), equalTo("하니" + USING_MESSAGE));
    }
}
