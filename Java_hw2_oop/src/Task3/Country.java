package Task3;

public class Country {
    private int Id;
    private String Name;
    private String Capital;
    private int Population;
    private float Area;

    public Country() {
    }

    public Country(int id, String name) {
        Name = name;
        Id = id;
    }

    public Country(int id, String name, String capital, int population, float area) {
        Id = id;
        Name = name;
        Capital = capital;
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

    public void ShowInfo(int id, int population) {
        if (id == Id && population == Population) {
            System.out.println("Name - " + this.Name);
            System.out.println("Population - " + this.Population);
            System.out.println("Area - " + this.Area);
            System.out.println("-------------");
        } else {
            System.out.println("You've put wrong id or population!");
            System.out.println("-------------");
        }
    }

}
