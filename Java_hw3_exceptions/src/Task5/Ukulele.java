package Task5;

public class Ukulele extends MusicalInstrument {
    public Ukulele(String name, String desc, String history) {
        if (name.length() < 300) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("You've tried to set too large string to Ukulele's name");
        }
        this.desc = desc;
        this.history = history;
    }

    @Override
    public void Sound() {
        System.out.println("The ukulele is making sounds..");
    }

    @Override
    public void Show() {
        System.out.println("The name of the ukulele is - " + this.name);
    }

    @Override
    public void Desc() {
        System.out.println("Ukulele's description: " + this.desc);
    }

    @Override
    public void History() {
        System.out.println("Ukulele's history: " + this.history);
    }
}
