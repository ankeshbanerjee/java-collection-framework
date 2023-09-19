import java.util.Arrays;

public class LearnArrayClass {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        // works for sorted array
        int index = Arrays.binarySearch(arr, 3);
        System.out.println("index of 3 is " + index);

        int[] a = {3, 2, 1, 9, 8, 2};
        Arrays.sort(a);
        for (int i: a){
            System.out.print(i + " ");
        }
        System.out.println('\n');

        // set all the elements to a value
        Arrays.fill(a, 11);
        for (int i: a){
            System.out.print(i + " ");
        }
    }
}
