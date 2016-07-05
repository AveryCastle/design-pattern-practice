package chap4.factory.method.exercise.idcard;

import chap4.factory.method.exercise.framework.Factory;
import chap4.factory.method.exercise.framework.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * IDCardFactory 클래스.
 */
public class IDCardFactory extends Factory {

    private Map<Integer, String> database = new HashMap<>();

    private int authenticationCode = 10000;

    @Override
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, authenticationCode++);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard idCard = (IDCard) product;
        Integer key = Integer.valueOf(idCard.getAuthenticationCode());
        database.put(key, idCard.getOwner());
    }

    public Map<Integer, String> getDatabase() {
        return database;
    }
}
