package Task4;

public class Steamship extends Device {

    private float length;
    private float width;
    private float maxSpeed;

    public Steamship(String name, int power, float length, float width, float maxSpeed) {
        this.name = name;
        if (power > 0)
            this.power = power;
        else throw new IllegalArgumentException("You've tried to set negative value to Steamship's power field");
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
