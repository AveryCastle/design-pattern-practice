package chap4.factory.method.idcard;

import chap4.factory.method.framework.Product;

/**
 * IDCard 클래스.
 */
public class IDCard implements Product {

    private String owner;

    public IDCard(String owner) {
        this.owner = owner;
        System.out.println(owner + "의 카드를 만듭니다.");
    }

    @Override
    public String use() {
        return owner + "의 카드를 사용 중입니다.";
    }

    public String getOwner() {
        return owner;
    }
}
