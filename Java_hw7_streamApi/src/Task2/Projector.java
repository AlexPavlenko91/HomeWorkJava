package Task2;

import java.util.Date;

public class Projector {
    private String name;
    private float price;
    private int year;
    private String manufacturer;

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Projector(String name, float price, int year, String manufacturer) {
        this.name = name;
        this.price = price;
        this.year = year;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Projector{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
