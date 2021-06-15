import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NameTest {

    @Test
    void noParameterTest() {

        String expected = "No Name info";
        IllegalStateException result = Assertions.assertThrows(IllegalStateException.class, () -> new PersonBuilder().build());

        Assertions.assertEquals(expected, result.getMessage());
    }

    @Test
    void noNameTest() {

        String expected = "No Name info";
        IllegalStateException result = Assertions.assertThrows(IllegalStateException.class, () -> new PersonBuilder().setSurname("b").build());

        Assertions.assertEquals(expected, result.getMessage());
    }


    @Test
    void absentNameTest() {

        String expected = "No Name info";
        IllegalStateException result = Assertions.assertThrows(IllegalStateException.class, () -> new PersonBuilder().setAge(10).build());

        Assertions.assertEquals(expected, result.getMessage());
    }


}
