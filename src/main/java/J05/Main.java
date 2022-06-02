package J05;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = it -> it > 0;
        assert (isPositive.test(10));


    }

    public static <T> List<T> filter(List<T> inputs, Predicate<T> filter) {
        List<T> result = new ArrayList<>();
        for (T t : inputs) {
            if (filter.test(t)) {
                result.add(t);
            }
        }
        return result;
    }
}
