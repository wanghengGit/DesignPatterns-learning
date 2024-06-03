package designpatterns.strategy;

public class PublicTransportStrategy implements TravelStrategy {
    @Override
    public int calculateMinCost() {
        return 1;
    }
}
