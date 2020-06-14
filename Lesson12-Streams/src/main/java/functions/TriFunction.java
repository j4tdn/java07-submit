package functions;

public interface TriFunction<T, S, U, R> {
	R apply(T t, S s, U u);
}