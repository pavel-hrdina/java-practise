import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.github.pavelhrdina.Main;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    @DisplayName("Main test")
    public void testMain() {
        assertEquals(1101100, Main.binaryMultiplication(1100, 1001));
    }
}
