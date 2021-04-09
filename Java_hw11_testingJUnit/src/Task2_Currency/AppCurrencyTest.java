package Task2_Currency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppCurrencyTest {
    private final Currency obj = new Currency();

    @Test
    public void fromUAHtoUSDTest() {
        assertEquals(3.59F, obj.fromUAHtoUSD(100F));
    }

    @Test
    public void fromUAHtoEURTest() {
        assertEquals(3.02F, obj.fromUAHtoEUR(100F));
    }

    @Test
    public void fromUAHtoGBPTest() {
        assertEquals(2.61F, obj.fromUAHtoGBP(100F));
    }

    @Test
    public void fromUAHtoJPYTest() {
        assertEquals(393.22F, obj.fromUAHtoJPY(100F));
    }

    @Test
    public void fromUSDtoUAHTest() {
        assertEquals(2790F, obj.fromUSDtoUAH(100F));
    }

    @Test
    public void fromEURtoUAHTest() {
        assertEquals(3316F, obj.fromEURtoUAH(100F));
    }

    @Test
    public void fromGBPtoUAHTest() {
        assertEquals(3829F, obj.fromGBPtoUAH(100F));
    }

    @Test
    public void fromJPYtoUAHTest() {
        assertEquals(25.43F, obj.fromJPYtoUAH(100F));
    }
}
