import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.

import static org.junit.jupiter.api.Assertions.assertEquals;

@PrepareForTest({Main.class})
public class MainTest {
     @Test
    public void testAdd() {
         mockStatic(Main.class);
         when(Main.main("add", 2, 3)).thenReturn(5.0);
         assertEquals(5, Main.main("add", 2, 3));
//         verify(Main.class, never()).multiply(2, 3);
     }

     @Test
    public void testMultiply() {
         mockStatic(Main.class);
         when(Main.main("multiply", 2, 3)).thenCallRealMethod();
         assertEquals(6, Main.main("multiply", 2, 3));
//         Mockito.<Class<Main>>verify(Main.class).multiply(2, 3);
     }
}