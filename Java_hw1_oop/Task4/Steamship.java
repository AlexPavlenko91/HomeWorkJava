public class Steamship extends Device {

    private float length;
    private float width;
    private float maxSpeed;

    public Steamship(String name, int power, float length, float width, float maxSpeed) {
        this.name = name;
        this.power = power;
        this.length = length;
        this.width = width;
        this.maxSpeed = maxSpeed;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void Sound() {
        System.out.println("TU TU!!!");
    }

    @Override
    public void Show() {
        System.out.println("The name of the steamship is - " + this.name);
    }

    @Override
    public void Desc() {
        System.out.println("Length - " + this.length + " m");
        System.out.println("Width - " + this.width + " m");
        System.out.println("Max speed - " + this.maxSpeed + " km/h");
    }

}
