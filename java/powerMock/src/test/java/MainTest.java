import org.example.Main;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.powermock.core.classloader.annotations.PrepareForTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.when;

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