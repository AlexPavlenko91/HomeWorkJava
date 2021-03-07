package Task1;

public class Sailor extends Human {
    private int experience;
    private String rank;

    public Sailor(int id, String name, String gender, Byte age, String profession, int experience, String rank) {
        super(id, name, gender, age, profession);
        this.experience = experience;
        this.rank = rank;
    }

    public void setExperience(byte experience) throws IllegalArgumentException{
        try {
            if (experience >= 0 && experience < (this.getAge() - 16)) {
                this.experience = experience;
            } else {
                System.out.println("You've tried to set illegal value to sailor's experience field");
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }
    }

    public void ShowSailor() {
        super.ShowInfo();
        System.out.println("Experience - " + this.experience);
        System.out.println("Rank - " + this.rank);
        System.out.println("----------");
    }
}
