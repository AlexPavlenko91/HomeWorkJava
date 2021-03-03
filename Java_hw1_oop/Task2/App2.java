public class App2 {
    public static void main(String[] args) {
        Crocodile crocodile = new Crocodile(1,"Crocco", "male", 1.5f, "American alligator", true);
        Tiger tiger = new Tiger(1,"Leona", "female", 2.3f, "Indo-Chinese tiger", true);
        Kangaroo kangaroo = new Kangaroo(1,"Tom", "male", 0.5f, "Quokka", false);
        crocodile.ShowCrocodile();
        tiger.ShowTiger();
        kangaroo.ShowKangaroo();
    }
}
