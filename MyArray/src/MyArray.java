import java.util.Random;
import java.util.Scanner;
public class MyArray {
    public static void main(String[] args) {
        // int[] arr = {5, 0, 10, 5, 9};
        int[] arr;
        arr = new int[4];
        int[] temperatures = new int[]{20, 12, 20, 20, 12, 20, 20, 12, 20, 20, 12, 20, 20, 12, 20, 20, 12, 20, 9, 29, 12, 10, 22, 17, 21, 18, 19,20};
        double result = 0;
        int kol = 0;
        int min = 0;
        int max = 10;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер задачи");
        int NumTask = in.nextInt();

        switch (NumTask) {
            case 1:

                for (int i = 0; i <= temperatures.length - 1; i++) {
                    result += temperatures[i];
                    kol = i;
                }
                result = result / (kol + 1);
                System.out.println(result);
                break;

            case 2:
                Random random = new Random();

                for (int a = 0; a < arr.length; a++) {
                    arr[a] = random.nextInt(max - min);
                }
                System.out.println("Исходный массив:");
                for (int j : arr) {
                    System.out.println(j);
                }

                bubbleSort(arr);
                if(arr[1] - arr[0] >= 3){
                    int sum = 0;
                    for (int i = 1; i < arr.length; i++) {
                        sum = sum + arr[i];
                    }
                    int averEl = sum / (arr.length-1);

                    arr[0] = averEl;
                    System.out.println("Откорректированный массив:");
                    for (int j : arr) {
                        System.out.println(j);
                    }
                }
                else{
                    System.out.println("Массив не требует корректировки");
                }
                break;
            case 3: break;
            default:
                System.out.println("Заданный номер не найден!");

        }
    }

    public static void bubbleSort( int[] array){
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

}