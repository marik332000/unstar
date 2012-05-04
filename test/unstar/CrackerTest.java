package unstar;

import org.junit.Test;
import static org.junit.Assert.*;

public class CrackerTest {

    @Test
    public void digitTest() {
        assertEquals(36, Cracker.DIGITS.length);
    }

    @Test
    public void encodeTest() {
        assertEquals("1", Cracker.encode(1, 1));
        assertEquals("A", Cracker.encode(1, 10));
        assertEquals("00RS", Cracker.encode(4, 1000));
        assertEquals(1000, Cracker.decode("00RS"));
    }

    @Test
    public void serialTest() {
        /* Public */
        assertEquals(0x1009db6241eL, Cracker.decode("E2BO659A"));
        assertEquals(0x10120a6bad5L, Cracker.decode("E3C03B2T")); // personal
        assertEquals(0x101e22fa47cL, Cracker.decode("E4TP99BW"));
        assertEquals(0x105d81aa6a9L, Cracker.decode("ECN101WP"));
        assertEquals(0x1071daf128cL, Cracker.decode("EF5D4KNG"));
        assertEquals(0x10f0e3321c7L, Cracker.decode("EUTBD0AV"));
        assertEquals(0x2042ff5da94L, Cracker.decode("SAH96KK4"));
        assertEquals(0x2042ff79a65L, Cracker.decode("SAH9910L"));
        assertEquals(0x20ea681ff37L, Cracker.decode("SV4GG27R"));
        assertEquals(0x20f6b14a736L, Cracker.decode("SWMZYHBQ"));
        assertEquals(0x2006dc96f67L, Cracker.decode("S32AAS87"));
        assertEquals(0x2042ff5354cl, Cracker.decode("SAH95NWS"));

        /* Discovered */
        assertEquals(0x2042ff197cbL, Cracker.decode("SAH90L3F"));
        assertEquals(0x2042ff1aabfL, Cracker.decode("SAH90OU7"));
        assertEquals(0x2042ff22bc1L, Cracker.decode("SAH91EBL"));
        assertEquals(0x2042ff27201l, Cracker.decode("SAH91S75"));
    }
}
