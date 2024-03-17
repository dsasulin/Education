package ru.sasulin.reflection;

import ru.sasulin.tests.ValidationException;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Validator {
    public static void validate(Object objectForTest){
        try {
            Class[] testClasses = objectForTest.getClass()
                    .getDeclaredAnnotation(Validate.class)
                    .value();
            for (Class testClasse: testClasses) {
                Constructor cnst = testClasse.getDeclaredConstructor();
                cnst.setAccessible(true);
                Object testObject = cnst.newInstance();
                Method[] tests = testClasse.getDeclaredMethods();
                for (Method test:tests ){
                    if (!test.isAnnotationPresent(Test.class)) continue;
                    System.out.println(test);
                    test.setAccessible(true);
                    test.invoke(testObject, objectForTest);
                }
            }
        }
        catch (InvocationTargetException error){
            Throwable throwable = error.getCause();
            if (throwable.getClass()== ValidationException.class) {
                throw (ValidationException)throwable;
            }
            throw new RuntimeException(throwable);
        }
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}

