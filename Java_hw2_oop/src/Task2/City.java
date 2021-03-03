package Task2;

public class City {
    private int Id;
    private String Name;
    private int Population;
    private float Area;

    public City() {    }

    public City(int id, String name) {
        Id = id;
        Name = name;
    }

    public City(int id, String name, int population, float area) {
        Id = id;
        Name = name;
        Population = population;
        Area = area;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int population) {
        Population = population;
    }

    public float getArea() {
        return Area;
    }

    public void setArea(float area) {
        Area = area;
    }

    public void ShowInfo() {
        System.out.println("Name - " + this.Name);
        System.out.println("Population - " + this.Population);
        System.out.println("Area - " + this.Area);
        System.out.println("-------------");
    }
    public void ShowInfo(int id) {
        if (id > 0) {
            System.out.println("Name - " + this.Name);
            System.out.println("Population - " + this.Population);
            System.out.println("Area - " + this.Area);
            System.out.println("-------------");
        }
        else {
            System.out.println("You've put wrong id!");
            System.out.println("-------------");
        }
    }
}
