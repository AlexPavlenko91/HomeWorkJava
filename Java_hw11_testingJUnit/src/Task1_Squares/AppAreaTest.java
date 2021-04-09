package Task1_Squares;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppAreaTest {
    private final Area obj = new Area();

    @Test
    public void rectangleTest() {
        assertEquals(6, obj.getRectangleArea(2, 3));
    }

    @Test
    public void triangleTest() {
        assertEquals(3, obj.getTriangleArea(3, 2));
    }

    @Test
    public void squareTest() {
        assertEquals(9, obj.getSquareArea(3));
    }

    @Test
    public void rhombusTest() {
        assertEquals(10, obj.getRhombusArea(4, 5));
    }
}
