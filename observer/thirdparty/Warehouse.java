package observer.thirdparty;

import observer.orders.OrderPlacedSubscriber;

public class Warehouse implements OrderPlacedSubscriber {
    @Override
    public void onOrderPlaced() {
        System.out.println("Updated warehouse storage.");
    }
}
