package immutable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableTest {
    public static void main(String[] args) {
//        Map<String, Integer> map = Map.of("a", 2);
//        map.put("x", 1);

//        Set.of();
//        List<Object> list = List.of("xxx");
//        list.add("a");
//        list.set(0, "a");

        List<Object> list2 = Arrays.asList("xxx");
//        list2.set(0, "ooo");
        list2.add("ooo");
        list2.forEach(System.out::println);
    }
}
