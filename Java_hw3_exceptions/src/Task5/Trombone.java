package Task5;

public class Trombone extends MusicalInstrument {
    public Trombone(String name, String desc, String history) {
        if (name.length() < 300) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("You've tried to set too large string to Trombone's name");
        }
        this.desc = desc;
        this.history = history;
    }

    @Override
    public void Sound() {
        System.out.println("The trombone is making sounds..");
    }

    @Override
    public void Show() {
        System.out.println("The name of the trombone is - " + this.name);
    }

    @Override
    public void Desc() {
        System.out.println("Trombone's description: " + this.desc);
    }

    @Override
    public void History() {
        System.out.println("Trombone's history: " + this.history);
    }
}
