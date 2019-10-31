import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class SouboryTest {

    @Test
    public void randomBytesToFile() {
        File vystupniSoubor = Soubory.randomBytesToFile(15);
        assertTrue(vystupniSoubor.exists());
        assertEquals(vystupniSoubor.length(),15);
    }
}
