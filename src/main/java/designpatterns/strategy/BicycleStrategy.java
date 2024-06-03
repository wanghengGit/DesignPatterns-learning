package designpatterns.strategy;

public class BicycleStrategy implements TravelStrategy {
    @Override
    public int calculateMinCost() {
        return 2;
    }
}
