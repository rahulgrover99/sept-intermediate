package observer.thirdparty;

import observer.orders.OrderPlacedSubscriber;

public class Inventory implements OrderPlacedSubscriber {
    @Override
    public void onOrderPlaced() {
        System.out.println("Updated the inventory");
    }
}
