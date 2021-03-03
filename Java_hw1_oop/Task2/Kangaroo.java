public class Kangaroo extends Animal {

    public Kangaroo(int id, String name, String gender, float age, String species, boolean predator) {
        super(id, name, gender, age, species, predator);
    }

    public void ShowKangaroo(){
        System.out.println("***   Kangaroo   ***");
        super.ShowInfo();
        System.out.println();
    }
}
