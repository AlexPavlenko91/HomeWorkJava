package Task6;

import Task7.ISort;

import java.util.Arrays;
import java.util.Random;

public class Array implements IMath, ISort {
    private int arr[];

    public Array(int[] arr) {
        this.arr = arr;
    }

    public Array() {
    }

    public void randFilling(int size, int multi) {
        arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(multi);
        }
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
        System.out.println(Arrays.toString(arr));
    }

}
