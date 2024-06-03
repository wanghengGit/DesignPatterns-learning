package designpatterns.strategy;

public class SelfDrivingStrategy implements TravelStrategy {
    @Override
    public int calculateMinCost() {
        return 30;
    }
}
