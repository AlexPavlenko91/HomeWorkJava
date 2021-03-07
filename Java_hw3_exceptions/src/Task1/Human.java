package Task1;

public class Human {
    private int id;
    private String name;
    private String gender;
    private byte age;
    private String profession;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
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

    static void checkAge(byte age) {
        if (age < 0) {
            throw new ArithmeticException("Age can't be negative");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public void setAge(byte age) {
        try {
            if (age > 0) {
                this.age = age;
            } else {
                System.out.println("You've tried to set illegal value to age field");
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Human(int id, String name, String gender, byte age, String profession) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.profession = profession;
    }

    public void ShowInfo() {
        System.out.println("Name - " + this.name);
        System.out.println("Gender - " + this.gender);
        System.out.println("Age - " + this.age);
        System.out.println("Profession - " + this.profession);
    }
}
