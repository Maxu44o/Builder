
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AgeTest {

    @Test
    void illegalAgeTest() {

        String expected = "Incorrect age";
        IllegalArgumentException result = Assertions.assertThrows(IllegalArgumentException.class, () -> new PersonBuilder().setName("a").setSurname("b").setAge(-100).build());

        Assertions.assertEquals(expected, result.getMessage());
    }

}
