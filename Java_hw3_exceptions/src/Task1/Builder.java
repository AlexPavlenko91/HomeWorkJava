package Task1;

public class Builder extends Human{
    private byte experience;

    public Builder(int id, String name, String gender, byte age, String profession, byte experience) {
        super(id, name, gender, age, profession);
        this.experience = experience;
    }

    public void setExperience(byte experience) throws IllegalArgumentException{
        try {
            if (experience >= 0 && experience < (this.getAge() - 16)) {
                this.experience = experience;
            } else {
                System.out.println("You've tried to set illegal value to builder's experience field");
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }
    }

    public void ShowBuilder() {
        super.ShowInfo();
        System.out.println("Experience - " + this.experience);
        System.out.println("----------");
    }
}
