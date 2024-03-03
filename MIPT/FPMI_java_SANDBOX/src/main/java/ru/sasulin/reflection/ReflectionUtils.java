package ru.sasulin.reflection;

import lombok.SneakyThrows;
import ru.sasulin.geometry.Line;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReflectionUtils {

    public static List<Field> getFields(Class cls){
        List<Field> lst = new ArrayList<>();
        while (cls != null){
            lst.addAll(Arrays.asList(cls.getDeclaredFields()));
            cls = cls.getSuperclass();
        }
        return lst;
    }
    @SneakyThrows

    public static void lineConector(Line line1, Line line2){
        Field  lineStart = Line.class.getDeclaredField("a");
        lineStart.setAccessible(true);
        lineStart.set(line2,line1.getB());
    }
}
