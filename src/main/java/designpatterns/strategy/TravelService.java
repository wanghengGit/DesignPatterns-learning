package designpatterns.strategy;

public class TravelService {
    private static TravelStrategyFactory travelStrategyFactory = new TravelStrategyFactory();

    public static int calculateMinCost(String travelWay) {
        TravelStrategy travelStrategy = travelStrategyFactory.createTravelStrategy(travelWay);
        return travelStrategy.calculateMinCost();
    }

    public static void main(String[] args) {
        System.out.println(calculateMinCost("selfDriving"));;
    }
}
