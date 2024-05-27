package observer.thirdparty;

import observer.orders.OrderPlacedSubscriber;

public class Notification implements OrderPlacedSubscriber {
    @Override
    public void onOrderPlaced() {
        System.out.println("Notification sent.");
    }
}
