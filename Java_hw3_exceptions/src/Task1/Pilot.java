package Task1;

public class Pilot extends Human {
    private int experience;
    private String rank;
    private int flownHours;

    public Pilot(int id, String name, String gender, byte age, String profession, int experience, String rank, int flownHours) {
        super(id, name, gender, age, profession);
        this.experience = experience;
        this.flownHours = flownHours;
        this.rank = rank;
    }

    public void setExperience(byte experience) {
        if (experience >= 0 && experience < (this.getAge() - 16)) {
            this.experience = experience;
        } else {
            System.out.println("You've tried to set illegal value to pilot's experience field");
        }
    }

    public void ShowPilot() {
        super.ShowInfo();
        System.out.println("Experience - " + this.experience);
        System.out.println("Rank - " + this.rank);
        System.out.println("Flown hours - " + this.flownHours);
        System.out.println("----------");
    }
}
