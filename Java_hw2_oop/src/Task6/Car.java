package Task6;

public class Car {
    private String Name;
    private String BrandName;
    private int Year;
    private float EngineVolume;

    public Car() {  };

    public Car(String name, String brandName, int year, float engineVolume) {
        Name = name;
        BrandName = brandName;
        Year = year;
        EngineVolume = engineVolume;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String brandName) {
        BrandName = brandName;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public float getEngineVolume() {
        return EngineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        EngineVolume = engineVolume;
    }

    public void Show() {
        System.out.println("*** Car ****");
        System.out.println("Name - " + Name);
        System.out.println("Manufacture's name - " + BrandName);
        System.out.println("Year manufacture - " + Year);
        System.out.println("Engine volume - " + EngineVolume);
        System.out.println("---------------");
    }

    public void Show(String yourName) {
        this.Show();
        System.out.println("Your name - " + yourName + " ;)");
        System.out.println("---------------");

    }
}
