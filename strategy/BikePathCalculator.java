package strategy;

import java.util.List;

public class BikePathCalculator implements PathCalculator{
    public BikePathCalculator(List<String> routes) {
    this.routes = routes;
}

    private final List<String> routes;

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Finding the most optimal path for Bike.");
        for (String route: routes) {

            System.out.println("considering route " + route);
        }
    }
}
