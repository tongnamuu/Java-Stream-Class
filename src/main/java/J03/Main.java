package J03;

import java.util.function.Supplier;

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
        Supplier<String> helloSupplier = () -> {
            return "Hello Supplier";
        };
        assert (helloSupplier.get().equals("Hello Supplier"));
        System.out.println(helloSupplier.get());

        MySupplier<Double> randomDoubleGenerator = () -> Math.random();
        printRandomDouble(randomDoubleGenerator, 5);
    }

    public static void printRandomDouble(MySupplier<Double> supplier, int count) {
        for (int i = 0; i < count; ++i) {
            System.out.println(supplier.eat());
        }
    }
}
