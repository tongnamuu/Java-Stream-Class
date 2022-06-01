package J04;

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
    }
}
