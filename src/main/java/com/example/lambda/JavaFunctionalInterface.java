package com.example.lambda;

public class JavaFunctionalInterface {

    public static void main(String[] args) {
        // Predicate<T>      |      T -> boolean
        // BiPredicate<T, U> | (T, U) -> boolean
        // IntPredicate      |    int -> boolean
        // LongPredicate     |   long -> boolean
        // DoublePredicate   | double -> boolean

        // Function<T, R>           |      T -> R
        // BiFunction<T, U, R>      | (T, U) -> R
        // IntFunction<R>           |    int -> R
        // LongFunction<R>          |   long -> R
        // DoubleFunction<R>        | double -> R
        // ToIntFunction<T>         |      T -> int
        // ToLongFunction<T>        |      T -> long
        // ToDoubleFunction<T>      |      T -> double
        // ToIntBiFunction<T, U>    | (T, U) -> int
        // ToLongBiFunction<T, U>   | (T, U) -> long
        // ToDoubleBiFunction<T, U> | (T, U) -> double
        // IntToLongFunction        |    int -> long
        // IntToDoubleFunction      |    int -> double
        // LongToIntFunction        |   long -> int
        // LongToDoubleFunction     |   long -> double
        // DoubleToIntFunction      | double -> int
        // DoubleToLongFunction     | double -> long

        // Supplier<T>     | void -> T
        // IntSupplier     | void -> int
        // LongSupplier    | void -> long
        // DoubleSupplier  | void -> double
        // BooleanSupplier | void -> boolean

        // Consumer<T>          |           T -> void
        // BiConsumer<T, U>     |      (T, U) -> void
        // IntConsumer          |         int -> void
        // LongConsumer         |        long -> void
        // DoubleConsumer       |      double -> void
        // ObjIntConsumer<T>    |    (T, int) -> void
        // ObjLongConsumer<T>   |   (T, long) -> void
        // ObjDoubleConsumer<T> | (T, double) -> void

        // UnaryOperator<T>     |                T -> T
        // BinaryOperator<T>    |           (T, T) -> T
        // IntUnaryOperator     |              int -> int
        // LongUnaryOperator    |             long -> long
        // DoubleUnaryOperator  |           double -> double
        // IntBinaryOperator    |       (int, int) -> int
        // LongBinaryOperator   |     (long, long) -> long
        // DoubleBinaryOperator | (double, double) -> double
    }
}
