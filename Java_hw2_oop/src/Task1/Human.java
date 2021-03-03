package Task1;

public class Human {
    private int id;
    private String name;
    private String gender;
    private int age;
    private String profession;

    public Human() {    }

    public Human(int id, String name, String gender, int age, String profession) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.profession = profession;
    }

    public Human(int id, String name) {
        this.id = id;
        this.name = name;
    }

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

    public void setAge(int age) {
        this.age = age;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }



    public void ShowInfo() {
        System.out.println("Name - " + this.name);
        System.out.println("Gender - " + this.gender);
        System.out.println("Age - " + this.age);
        System.out.println("Profession - " + this.profession);
        System.out.println("-------------");
    }
    public void ShowInfo(int id) {
        if (id > 0) {
            System.out.println("Name - " + this.name);
            System.out.println("Gender - " + this.gender);
            System.out.println("Age - " + this.age);
            System.out.println("Profession - " + this.profession);
            System.out.println("-------------");
        }
        else {
            System.out.println("You've put wrong id!");
            System.out.println("-------------");
        }
    }
}
