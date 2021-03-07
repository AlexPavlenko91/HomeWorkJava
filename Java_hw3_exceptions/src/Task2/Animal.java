package Task2;

public class Animal {
    private int id;
    private String name;
    private String gender;
    private float age;
    private String species;
    private boolean predator;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public float getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    public boolean isPredator() {
        return predator;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public void setPredator(boolean predator) {
        this.predator = predator;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Animal(int id, String name, String gender, float age, String species, boolean predator)
            throws IllegalArgumentException  {
        this.id = id;
        this.name = name;
        this.gender = gender;
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("You've tried to set negative value to age field");
            throw new IllegalArgumentException();
        }
        this.species = species;
        this.predator = predator;
    }

    public void ShowInfo() {
        System.out.println("Name - " + this.name);
        System.out.println("Gender - " + this.gender);
        System.out.println("Age - " + this.age);
        System.out.println("Species - " + this.species);
        if (this.predator) System.out.println("Predator");
    }
}
