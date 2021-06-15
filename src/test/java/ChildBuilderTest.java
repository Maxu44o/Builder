import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChildBuilderTest {
    @Test
    void noNameTest() {

        String expected = "No Name info";
        IllegalStateException result = Assertions.assertThrows(IllegalStateException.class, () -> new PersonBuilder().setName("a").setSurname("b").build().newChildBuilder(5).build());

        Assertions.assertEquals(expected, result.getMessage());
    }
}
