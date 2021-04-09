package Task5_Weight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppWeightTest {
    private final Weight obj= new Weight();

    @Test
    public void getMiligramsTest(){
        assertEquals(100_000, obj.getMilligrams(100));
    }

    @Test
    public void getKilogramsTest(){
        assertEquals(0.1, obj.getKilograms(100));
    }
    @Test
    public void getCentnersTest(){
        assertEquals(1, obj.getCentners(100));
    }

    @Test
    public void getTonsTest(){
        assertEquals(0.1, obj.getTons(100));
    }
    @Test
    public void getGramsFromOunceTest(){
        assertEquals(3.5274, obj.getGramsFromOunce(100));
    }
}
