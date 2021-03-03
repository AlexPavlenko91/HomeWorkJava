public class Car extends Device {
    private String type;
    private String fuelType;
    private float maxSpeed;


    public Car(String name, String type, int power, String fuelType, float maxSpeed) {
        this.name = name;
        this.type = type;
        this.power = power;
        this.fuelType = fuelType;
        this.maxSpeed = maxSpeed;
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
