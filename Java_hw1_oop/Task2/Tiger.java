public class Tiger extends Animal {

    public Tiger(int id, String name, String gender, float age, String species, boolean predator) {
        super(id, name, gender, age, species, predator);
    }

    public void ShowTiger(){
        System.out.println("***   Tiger   ***");
        super.ShowInfo();
        System.out.println();
    }
}
