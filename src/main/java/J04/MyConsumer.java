package J04;

@FunctionalInterface
public interface MyConsumer<T> {
    void accept(T t);
}
