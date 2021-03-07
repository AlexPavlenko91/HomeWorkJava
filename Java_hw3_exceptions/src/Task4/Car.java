package Task4;

public class Car extends Device {
    private final String type;
    private final String fuelType;


    public Car(String name, String type, int power, String fuelType, float maxSpeed) throws IllegalArgumentException {
        this.name = name;
        this.type = type;
        if (power > 0)
            this.power = power;
        else throw new IllegalArgumentException("You've tried to set negative value to car's power field");
        this.fuelType = fuelType;
    }

    @Override
    public void Sound() {
        System.out.println("vroom vroom vroooom!!!");
    }

    @Override
    public void Show() {
        System.out.println("The brand name of the car - " + this.name);
    }

    @Override
    public void Desc() {
        System.out.println("Type - " + this.type);
        System.out.println("Power - " + this.power + " HP");
        System.out.println("Fuel type - " + this.fuelType);
    }
}
