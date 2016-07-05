package chap4.factory.method.exercise.idcard;

import chap4.factory.method.exercise.framework.Product;

/**
 * IDCard 클래스.
 */
public class IDCard implements Product {

    private String owner;

    private int authenticationCode;

    public IDCard(String owner, int authenticationCode) {
        this.owner = owner;
        this.authenticationCode = authenticationCode;
        System.out.println(owner + "의 카드 " + authenticationCode + "를 만듭니다.");
    }

    @Override
    public String use() {
        return owner + "의 카드 " + authenticationCode + "를 사용 중입니다.";
    }

    public String getOwner() {
        return owner;
    }

    public int getAuthenticationCode() {
        return authenticationCode;
    }
}
