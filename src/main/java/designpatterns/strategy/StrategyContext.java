package designpatterns.strategy;

public class StrategyContext {
    private TravelStrategy strategy;

    public StrategyContext(TravelStrategy strategy) {
        this.strategy = strategy;
    }

    public int calculateMinCost() {
        return strategy.calculateMinCost();
    }
}
