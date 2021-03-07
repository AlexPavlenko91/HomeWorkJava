package Task5;

public class Violoncello extends MusicalInstrument {
    public Violoncello(String name, String desc, String history) {
        if (name.length() < 300) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("You've tried to set too large string to Violoncello's name");
        }
        this.desc = desc;
        this.history = history;
    }

    @Override
    public void Sound() {
        System.out.println("The violoncello is making sounds..");
    }

    @Override
    public void Show() {
        System.out.println("The name of the violoncello is - " + this.name);
    }

    @Override
    public void Desc() {
        System.out.println("Violoncello's description: " + this.desc);
    }

    @Override
    public void History() {
        System.out.println("Violoncello's history: " + this.history);
    }
}
