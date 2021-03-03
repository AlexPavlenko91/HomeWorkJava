import java.util.Arrays;
import java.util.Collections;

public class App7 {
    public static void main(String[] args) {
        Array arr2 = new Array(new int[]{5, 2, 0, 1, 8, 7, 5});
        arr2.SortAsc();
        arr2.PrintArr();
        System.out.println("------------");
        arr2.SortDesc();
        arr2.PrintArr();
    }
}
