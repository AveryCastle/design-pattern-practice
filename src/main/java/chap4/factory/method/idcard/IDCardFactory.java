package chap4.factory.method.idcard;

import chap4.factory.method.framework.Factory;
import chap4.factory.method.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * IDCardFactory 클래스.
 */
public class IDCardFactory extends Factory {

    private List<String> owners = new ArrayList<String>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard idCard = (IDCard) product;
        owners.add(idCard.getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}
