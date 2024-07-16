import java.util.Arrays;import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {        int [] arr = {9, 2, 3, 1, 8, 6, 12};
        Arrays.sort(arr);        // сортируем массив
        System.out.println("Второй по величине элемент: " + arr[arr.length-2]);    }
}