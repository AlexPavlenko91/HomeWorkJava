public class Pilot extends Human {
    private int experience;
    private String rank;
    private int flownHours;

    public Pilot(int id, String name, String gender, int age, String profession, int experience, String rank, int flownHours) {
        super(id, name, gender, age, profession);
        this.experience = experience;
        this.flownHours = flownHours;
        this.rank = rank;
    }

    public int getExperience() {
        return experience;
    }

    public String getRank() { return rank; }

    public int getFlownHours() { return flownHours; }

    public void setExperience(int experience) { this.experience = experience; }

    public void setRank(String rank) { this.rank = rank; }

    public void setFlownHours(int flownHours) { this.flownHours = flownHours; }

    public void ShowPilot(){
        super.ShowInfo();
        System.out.println("Experience - " + this.experience);
        System.out.println("Rank - " + this.rank);
        System.out.println("Flown hours - " + this.flownHours);
        System.out.println("----------");
    }
}
