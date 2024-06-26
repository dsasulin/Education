package ru.sasulin.reflection;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Entity {
    //@Override
    @SneakyThrows
    public final String ToString(){
        List<Field> fields= ReflectionUtils.getFields(this.getClass());
        Map<String, Object> map = new HashMap<>();

        for (Field f: fields){
            ToString toString = f.getDeclaredAnnotation(ToString.class);
            if (toString == null) toString = f.getDeclaringClass().getDeclaredAnnotation(ToString.class);
            if (!(toString == null||toString.value()==NeedToString.YES )) continue;
            if (Modifier.isStatic(f.getModifiers())) continue;
            f.setAccessible(true);
            map.put(f.getName(), f.get(this));
        }
        return this.getClass().getSimpleName() + map;
    }
}
