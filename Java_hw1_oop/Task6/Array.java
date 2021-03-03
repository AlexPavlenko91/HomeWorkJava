import java.util.Arrays;
import java.util.Collections;

public class Array implements IMath, ISort {
    private int arr[];

    public Array(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public int Max() {
        return Arrays.stream(this.arr).max().getAsInt();
    }

    public int Min() {
        return Arrays.stream(this.arr).min().getAsInt();
    }

    public float Avg() {
        return (float) Arrays.stream(this.arr).average().getAsDouble();
    }

    public void SortAsc() {
        Arrays.sort(arr);
    }

    public void SortDesc() {
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    public void PrintArr() {
        /*for (int i = 0; i < this.arr.length; i++) {
            System.out.println(arr[i]);
        }*/
        System.out.println(Arrays.toString(arr));
    }

}
