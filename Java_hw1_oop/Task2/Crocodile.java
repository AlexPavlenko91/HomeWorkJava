public class Crocodile extends Animal {

    public Crocodile(int id, String name, String gender, float age, String species, boolean predator) {
        super(id, name, gender, age, species, predator);
    }

    public void ShowCrocodile(){
        System.out.println("***   Crocodile   ***");
        super.ShowInfo();
        System.out.println();
    }
}
