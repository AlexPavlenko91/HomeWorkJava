package Task2_Currency;

import static java.lang.Math.floor;

public class Currency {

    public float fromUAHtoUSD(float a) {
        return (float) (0.01 * floor((a * 0.036F) * 100.0));
    }

    public float fromUAHtoEUR(float a) {
        return (float) (0.01 * floor((a * 0.0303F) * 100.0));
    }

    public float fromUAHtoGBP(float a) {
        return (float) (0.01 * floor((a * 0.0261F) * 100.0));
    }

    public float fromUAHtoJPY(float a) {
        return (float) (0.01 * floor((a * 3.9322F) * 100.0));
    }


    public float fromUSDtoUAH(float a) {
        return (float) (0.01 * floor((a * 27.9F) * 100.0));
    }

    public float fromEURtoUAH(float a) {
        return (float) (0.01 * floor((a * 33.16F) * 100.0));
    }

    public float fromGBPtoUAH(float a) {
        return (float) (0.01 * floor((a * 38.29F) * 100.0));
    }

    public float fromJPYtoUAH(float a) {
        return (float) (0.01 * floor((a * 0.2543F) * 100.0));
    }

}
