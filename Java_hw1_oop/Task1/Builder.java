public class Builder extends Human {
    private int experience;

    public Builder(int id, String name, String gender, int age, String profession, int experience) {
        super(id, name, gender, age, profession);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void ShowBuilder(){
        super.ShowInfo();
        System.out.println("Experience - " + this.experience);
        System.out.println("----------");
    }
}
