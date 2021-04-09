package Task4_Length;

public class LengthValues {
    public double getKM(double meters) {
        return meters * 0.001;
    }

    public double getDM(double meters) {
        return meters * 10;
    }

    public double getCM(double meters) {
        return meters * 100;
    }

    public double getMM(double meters) {
        return meters * 1000;
    }

    public double getMeters(double feet) {
        return feet * 0.3048;
    }
}
