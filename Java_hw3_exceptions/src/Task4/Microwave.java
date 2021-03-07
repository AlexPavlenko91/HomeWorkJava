package Task4;

public class Microwave extends Device {
    private int capacity;

    public Microwave(String name, int capacity, int power) {
        this.name = name;
        this.capacity = capacity;
        if (power > 0)
            this.power = power;
        else throw new IllegalArgumentException("You've tried to set negative value to Microwave's power field");
    }

    @Override
    public void Sound() {
        System.out.println("zzhhhhhhhhhhhhh... dzin!!!");
    }

    @Override
    public void Show() {
        System.out.println("The brand name of the microwave - " + this.name);
    }

    @Override
    public void Desc() {
        System.out.println("Capacity - " + this.capacity + " liters");
        System.out.println("Power - " + this.power + " W");
    }
}
