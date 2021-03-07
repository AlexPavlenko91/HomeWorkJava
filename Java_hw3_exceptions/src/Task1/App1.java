package Task1;

public class App1 {
    public static void main(String[] args) throws ArithmeticException {
        Builder builder1 = new Builder(
                1, "Jack", "male", (byte)35, "Builder", (byte)10);
        builder1.setExperience((byte)128);
        builder1.ShowBuilder();

        Builder builder2 = new Builder(
                2, "Robin", "male", (byte)32, "Builder", (byte)7);
        builder2.setExperience((byte)(99999 * 99999));
        builder2.ShowBuilder();

        Human human1 = new Human(3, "Alex", "male", (byte)29, "Programmer");
        human1.setAge((byte)222);
        human1.ShowInfo();

        Sailor sailor1 = new Sailor(
                4, "Vasiliy", "male", (byte)45, "Sailor", (byte)20,
                "Captain of the ship");
        sailor1.setExperience((byte)100);
        sailor1.ShowSailor();

        Pilot pilot1 = new Pilot(
                5, "Anna", "female", (byte)35, "Pilot", (byte)12,
                "Fighter pilot", 5200);
        pilot1.setExperience((byte)40);
        pilot1.ShowPilot();

    }
}
