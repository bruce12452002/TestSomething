package strategy;

import java.util.function.Consumer;

public record StrategyContext2(Consumer<String> strategy) {
    public void method(String str) {
        strategy.accept(str);
    }
}
