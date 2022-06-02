package J05;

@FunctionalInterface
public interface MyPredicate<T> {
    boolean test(T t);
}
