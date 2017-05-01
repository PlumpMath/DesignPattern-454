package FactoryMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hadoop on 17-4-30.
 */
public class IDCardFactory extends Factory {
    private List owners = new ArrayList();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product p) {
        owners.add(((IDCard)p).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
