package Task5_Weight;

public class Weight {
    public double getMilligrams(double grams){
        return grams * 1000;
    }
    public double getKilograms(double grams){
        return grams * 0.001;
    }

    public double getCentners(double kilograms){
        return kilograms * 0.01;
    }
    public double getTons(double kilograms){
        return kilograms * 0.001;
    }
    public double getGramsFromOunce(double grams){
        return grams * 0.035274;
    }
}
