public class Sailor extends Human {
    private int experience;
    private String rank;

    public Sailor(int id, String name, String gender, int age, String profession, int experience, String rank) {
        super(id, name, gender, age, profession);
        this.experience = experience;
        this.rank = rank;
    }

    public int getExperience() {
        return experience;
    }

    public String getRank() {
        return rank;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void ShowSailor() {
        super.ShowInfo();
        System.out.println("Experience - " + this.experience);
        System.out.println("Rank - " + this.rank);
        System.out.println("----------");
    }
}
