package Task4;

public class Fraction {
    private int IntPart;
    private int FloatPart;

    public Fraction() {
    }

    public Fraction(int intPart, int floatPart) {
        IntPart = intPart;
        FloatPart = floatPart;
    }

    public int getIntPart() {
        return IntPart;
    }

    public void setIntPart(int intPart) {
        IntPart = intPart;
    }

    public float getFloatPart() {
        return FloatPart;
    }

    public void setFloatPart(int floatPart) {
        FloatPart = floatPart;
    }

    public Fraction Add(int intPart, int floatPart) {
        IntPart += intPart;
        FloatPart += floatPart;
        return this;
    }

    public Fraction Add(int intPart, float floatPart) {
        if (floatPart > 1) {
            System.out.println("Please, pass the float part less then 1");
            return null;
        } else {
            IntPart += intPart;
            FloatPart += floatPart;
            return this;
        }
    }
    public void Show(){
        System.out.println(IntPart + "." + FloatPart);
        System.out.println("-------------");
    }

}
