import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SurnameTest {
    @Test
    void noNameTest() {

        String expected = "No Surname info";
        IllegalStateException result = Assertions.assertThrows(IllegalStateException.class, () -> new PersonBuilder().setName("a").build());

        Assertions.assertEquals(expected, result.getMessage());
    }


    @Test
    void absentNameTest() {

        String expected = "No Surname info";
        IllegalStateException result = Assertions.assertThrows(IllegalStateException.class, () -> new PersonBuilder().setName("a").setAge(10).build());

        Assertions.assertEquals(expected, result.getMessage());
    }
}
