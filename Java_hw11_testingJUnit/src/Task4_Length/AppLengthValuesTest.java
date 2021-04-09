package Task4_Length;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppLengthValuesTest {
    private final LengthValues obj = new LengthValues();

    @Test
    public void getKMTest() {
        assertEquals(0.25075000000000003, obj.getKM(250.75));
    }

    @Test
    public void getDMTest() {
        assertEquals(1000, obj.getDM(100));
    }

    @Test
    public void getCMTest() {
        assertEquals(10_000, obj.getCM(100));
    }

    @Test
    public void getMMTest() {
        assertEquals(100_000, obj.getMM(100));
    }

    @Test
    public void getMetersTest() {
        assertEquals(30.48, obj.getMeters(100));
    }
}
