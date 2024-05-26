import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.sasulin.reflection.Entity;

public class EntityTests {
    Entity entity1 = new Entity();

    @Test
    @DisplayName("fields are NOT accessible")
    @Disabled

    void test1() {
        Assertions.assertThrows(RuntimeException.class, () -> entity1.toString(),
                "Отсутствует доступ к полям");
    }

    @Test
    @DisplayName("NeedToString.NO isn't included in toString()")
    void test2() {
        Assertions.assertNotEquals("Entity1{string1=Test2, string2=Test2, x1=11, x2=22}",
                entity1.toString(), "Отображаются поля с NeedToString.NO");
    }


    @Test
    @DisplayName("NeedToString.YES on class is not included in toString()")
    void test3() {

        Assertions.assertNotEquals("Entity1{string1=Test3, string2=Test32, x1=11}",
                entity1.toString(), "Не отображаются поля с NeedToString.YES на классе");
    }

    @Test
    @DisplayName("static fields isn't included in toString()")
    void test4() {
        Assertions.assertNotEquals("Entity1{string4=Test4, string1=Test1, string2=Test2, x1=11, x4=44}",
                entity1.toString(), "Отображаются статические поля класса");
    }

}
