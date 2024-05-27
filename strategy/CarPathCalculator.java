package strategy;

import java.util.List;

public class CarPathCalculator implements PathCalculator{

    public CarPathCalculator(List<String> routes) {
        this.routes = routes;
    }

    private final List<String> routes;

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Finding the most optimal path for Car.");
        for (String route: routes) {
            System.out.println("considering route " + route);
        }
    }
}
