import java.util.Scanner;
import java.util.Arrays;

class Main {
    // implement

    private static void swap(int[] arr, int i,int j){
        int n = arr[i];
        arr[i] = arr[j];
        arr[j] = n;
    }
    private static void rotate(int[] arr, int steps) {
        steps = steps % arr.length;
        int[] a = new int[arr.length];
        for(int i = 0;i < arr.length;i++)
            a[i] = arr[i];
        for(int i = 0;i < arr.length;i++){
            int j = (i + (arr.length-steps)) % arr.length;
            arr[i] = a[j];
        }
    }

    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}