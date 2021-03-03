public class Kettle extends Device {
    private float capacity;

    public Kettle(String name, float capacity, int power) {
        this.name = name;
        this.capacity = capacity;
        this.power = power;
    }

    @Override
    public void Sound() {
        System.out.println("swiiiiiiiiiiiiiiiish!!!");
    }

    @Override
    public void Show() {
        System.out.println("The brand name of the kettle - " + this.name);
    }

    @Override
    public void Desc() {
        System.out.println("Capacity - " + this.capacity + " liters");
        System.out.println("Power - " + this.power + " W");
    }
}
