import org.example.Main;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.powermock.reflect.Whitebox;
import org.powermock.api.mockito.PowerMockito;

import org.powermock.core.classloader.annotations.PrepareForTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(PowerMockitoExtension.class)
@PrepareForTest(Main.class)
public class MainTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    public void testAddWithMockedStaticMethod() throws Exception {
        // Mock the static method
        PowerMockito.mockStatic(Main.class);

        // Define the behavior of the static method
        PowerMockito.when(Main.add(2, 3)).thenReturn(10);

        // Call the method that uses the static method
        int result = Main.add(2, 3);

        // Verify the result
        assertEquals(10, result);

        // Verify that the static method was called with the correct arguments
        PowerMockito.verifyStatic(Main.class);
        Main.add(2, 3);
    }
}
