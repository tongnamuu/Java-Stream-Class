package J04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
Functional Interface
1. Supplier
2. Consumer
3. BiConsumer
4. Predicate
5. Comparator
 */
public class Main {
    public static void main(String[] args) {
        Consumer<String> stringConsumer = (String s) -> {
            System.out.println(s);
        };

        stringConsumer.accept("Hello Consumer");

        List<Integer> numbers = Arrays.asList(3, 4, 7, 1, 12, 55);
        Consumer<Integer> processor = (it) -> System.out.println("Process with Number " + it);
        process(numbers, processor);
    }

    public static void process(List<Integer> numbers, Consumer<Integer> processor) {
        for(int i : numbers) {
            processor.accept(i);
        }
    }
}
