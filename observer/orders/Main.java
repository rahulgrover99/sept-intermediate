package observer.orders;

import observer.thirdparty.Inventory;
import observer.thirdparty.Notification;
import observer.thirdparty.Warehouse;

public class Main {

    public static void main(String[] args) {

        Orders orders = new Orders();

        orders.addSubscriber(new Inventory());
        orders.addSubscriber(new Notification());


        orders.placeOrder(1);

        orders.placeOrder(2);


        orders.addSubscriber(new Warehouse());
        orders.placeOrder(3);
    }

}
