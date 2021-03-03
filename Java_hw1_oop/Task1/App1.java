public class App1 {
    public static void main(String[] args) {
        Builder builder1 = new Builder(
                1, "Jack", "male", 35, "Builder", 10);
        Builder builder2 = new Builder(
                2, "Robin", "male", 32, "Builder", 7);
        Sailor sailor1 = new Sailor(
                1, "Vasiliy", "male", 45, "Sailor", 20,
                "Captain of the ship");
        Sailor sailor2 = new Sailor(
                2, "Ivan", "male", 37, "Sailor", 8,
                "Skipper");
        Pilot pilot1 = new Pilot(
                1, "Stepan", "male", 35, "Pilot", 12,
                "Aircraft captain", 5000);
        Pilot pilot2 = new Pilot(
                2, "Anna", "female", 35, "Pilot", 12,
                "Fighter pilot", 5200);
        builder1.ShowBuilder();
        builder2.ShowBuilder();
        sailor1.ShowSailor();
        sailor2.ShowSailor();
        pilot1.ShowPilot();
        pilot2.ShowPilot();
    }
}
