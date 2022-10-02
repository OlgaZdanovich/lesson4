import java.util.Scanner;
public class MyArray {
    public static void main(String[] args) {
        int[] temperatures = new int[]{20, 12, 20, 20, 12, 20, 20, 12, 20, 20, 12, 20, 20, 12, 20, 20, 12, 20, 9, 29, 12, 10, 22, 17, 21, 18, 19,20};
        double result = 0;
        int kol = 0;
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
            case 2: break;
            default:
                System.out.println("Заданный номер не найден!");

        }
    }
}
