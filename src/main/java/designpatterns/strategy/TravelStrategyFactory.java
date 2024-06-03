package designpatterns.strategy;

public class TravelStrategyFactory {
    public TravelStrategy createTravelStrategy(String travelWay) {
        if ("selfDriving".equals(travelWay)) {
            return new SelfDrivingStrategy();
        } if ("bicycle".equals(travelWay)) {
            return new BicycleStrategy();
        } else {
            return new PublicTransportStrategy();
        }
    }
}
