package strategy;

import java.util.List;

public class Client {

    public static void main(String[] args) {

        PathCalculator pc = new CarPathCalculator(List.of("car1", "car2"));

        PathCalculator bpc = new BikePathCalculator(List.of("bike1", "bike2"));


        pc.findPath("delhi", "chandigarh");

        bpc.findPath("Model town", "urban estate");


        bpc.findPath("jalandhar", "gurgaon");

    }

}
