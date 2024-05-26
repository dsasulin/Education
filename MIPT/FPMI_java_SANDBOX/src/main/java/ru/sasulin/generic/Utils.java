package ru.sasulin.generic;

import ru.sasulin.geometry.Line;
import ru.sasulin.geometry.Point;
import ru.sasulin.geometry.Point3D;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Utils {
    public static void moveX(Line<? extends Point> line) {
        if (line.getStart().getX() >= 0) {
            line.getStart().setX(line.getStart().getX() + 10);
        } else line.getStart().setX(line.getStart().getX() - 10);
    }

    public static double findMax(List<Box<? extends Number>> storageList) {
        if (storageList.isEmpty()) {
            throw new IllegalArgumentException();
        }
        double max = storageList.get(0).getItem().doubleValue();
        for (int i = 1; i < storageList.size(); i++) {
            double x = storageList.get(i).getItem().doubleValue();
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    public static void putPoint3D(Box<? super Point3D> point3DBox, Point3D point3D) {
        point3DBox.putItem(point3D);
    }

    public static void fillList(List<? super Number> numberList) {
        for (int i = 1; i <= 100; i++) {
            numberList.add(i);
        }
    }

    public static <T, P> List<P> map(List<T> list, Applyable<T, P> applyable) {
        List<P> pList = new ArrayList<>();
        for (T t : list) {
            pList.add(applyable.apply(t));
        }
        return pList;
    }

    public static <T> List<T> filter(List<T> list, Testable<T> testable) {
        List<T> newList = new ArrayList<>(list);
        for (T t : list) {
            if (!testable.test(t)) {
                newList.remove(t);
            }
        }
        return newList;
    }

    public static <T> Optional<T> reduce(List<T> list, Reductable<T> method) {
        if (list.isEmpty()) return Optional.empty();
        T res = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            res = method.red(res, list.get(i));
        }
        return Optional.of(res);

    }
}
