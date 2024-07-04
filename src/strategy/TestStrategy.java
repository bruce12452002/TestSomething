package strategy;

import java.util.Map;
import java.util.function.Consumer;

public class TestStrategy {
    public static void main(String[] args) {
        String data = "aa";
//        if ("a".equals(data)) {
//            System.out.println("方法一");
//        } else if ("b".equals(data)) {
//            System.out.println("方法二");
//        } else if ("c".equals(data)) {
//            System.out.println("方法三");
//        }

        // 錦囊妙計
//        Map<String, Strategy> map = Map.of("a", new StrategyA(), "b", new StrategyB(), "c", new StrategyC());
//        new StrategyContext(map.getOrDefault(data, new StrategyB())).method();


        Map<String, Consumer<String>> map = Map.of(
                "a", str -> System.out.println("方法一"),
                "b", str -> System.out.println("方法二"),
                "c", str -> System.out.println("方法三"));
        new StrategyContext(map.getOrDefault(data,
                str -> System.out.println("沒 get 到"))).method("xxx");

//        Strategy s1 = str -> System.out.println("方法一");
//        Runnable s2 = () -> System.out.println("方法一");
//        AutoCloseable s3 = () -> System.out.println("方法一");
    }
}
