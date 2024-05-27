package observer.orders;

import java.util.ArrayList;
import java.util.List;

public class Orders {

    List<OrderPlacedSubscriber> subscriberList = new ArrayList<>();


    public void addSubscriber(OrderPlacedSubscriber orderPlacedSubscriber) {
        subscriberList.add(orderPlacedSubscriber);
    }

    public void removeSubscriber(OrderPlacedSubscriber orderPlacedSubscriber) {
        subscriberList.remove(orderPlacedSubscriber);
    }


    void placeOrder(Integer productId) {
        for (OrderPlacedSubscriber subscriber: subscriberList) {
            subscriber.onOrderPlaced();
        }
    }

}
