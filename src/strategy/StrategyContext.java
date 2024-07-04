package strategy;

import java.util.function.Consumer;

public class StrategyContext {
    private final Consumer<String> strategy;

    public StrategyContext(Consumer<String> strategy) {
        this.strategy = strategy;
    }

    public void method(String str) {
        strategy.accept(str);
    }
}
