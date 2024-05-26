package ru.sasulin.main;

import java.util.*;
import java.util.function.*;

public class Starter {

    public void main(String[] args) throws Exception {
        List.of("Qwwqw", "ty5ty", "6", "A11");
        DataStream<Integer> ds = new DataStream<>(List.of(4, -2, 9, -4, 25, -7, -8));
        ds = ds.filter(x -> x > 0)
                .map(x -> Math.sqrt(x))
                .map(x -> x.intValue());
        int res = ds.reduce((x, y) -> x + y, 0);
        List<Integer> resList = ds.collect(ArrayList::new, (xLst, x) -> xLst.add(x));
    }

    /*
    1) статический метод инициализации
    2) доделать метод collect
    3) опционально: переделать текущую реализацию в ОО стиле
    4) выполнить задачки c применением нашего DataStream
    4.1 есть список строк, отобрать те строки, которые начинаются с большой буквы, и посчитать общую длину оставшихся строк
    4.2 есть список чисел, удалить нули, результат разложить по двум спискам: в одном отрицательные значения, в другом положительные
    4.3 дан список строк, некоторые из них числа. Удалить все строки НЕ являющиеся числами, преобразовать строки в числа, и получить их сумму
     */
    class DataStream<T> {
        private final List<T> list;
        private final List actions = new ArrayList();

        public DataStream(List<T> list) {
            this.list = list;
        }

        public <T> DataStream<T> of(List<T> list) {
            return new DataStream<>(list);
        }

        public <R> DataStream<R> map(Function<T, R> function) {
            actions.add(function);
            return (DataStream) this;
        }

        public DataStream<T> filter(Predicate<T> rule) {
            actions.add(rule);
            return this;
        }

        public <R> R collect(Supplier<R> init, BiConsumer<R, T> op) {
            R result = init.get();
            up:
            for (T element : list) {
                for (Object action : actions) {
                    if (action instanceof Function) {
                        Function fun = (Function) action;
                        element = (T) fun.apply(element);
                        continue;
                    }
                    if (action instanceof Predicate) {
                        Predicate rule = (Predicate) action;
                        if (!rule.test(element)) {
                            continue up;
                        }
                    }
                }
                op.accept(result, element);
            }
            return result;
        }

        public T reduce(BinaryOperator<T> operator, T start) {
            T res = start;
            up:
            for (T t : list) {
                for (Object action : actions) {
                    if (action instanceof Function) {
                        Function fun = (Function) action;
                        t = (T) fun.apply(t);
                        continue;
                    }
                    if (action instanceof Predicate) {
                        Predicate rule = (Predicate) action;
                        if (!rule.test(t)) {
                            continue up;
                        }
                    }
                }
                res = operator.apply(res, t);
            }
            return res;
        }
    }
}
