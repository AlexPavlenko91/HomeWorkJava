package Task5;

public class Violin extends MusicalInstrument {

    public Violin(String name, String desc, String history) {
        if (name.length() < 300) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("You've tried to set too large string to Violin's name");
        }
        this.desc = desc;
        this.history = history;
    }

    @Override
    public void Sound() {
        System.out.println("The violin is making sounds..");
    }

    @Override
    public void Show() {
        System.out.println("The name of the violin is - " + this.name);
    }

    @Override
    public void Desc() {
        System.out.println("Violin's description: " + this.desc);
    }

    @Override
    public void History() {
        System.out.println("Violin's history: " + this.history);
    }
}
