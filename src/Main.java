import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = sc.nextInt();
        System.out.println("Сумма входящих чисел " + triangleNum(number));
        System.out.printf("Произведение входящих чисел = %d", factNum(number));
        sc.close();
    }


    public static int triangleNum(int number) {
        int triangleNumber = (number * (number + 1)) / 2;
        return triangleNumber;
    }

    public static int factNum(int number) {
        if (number == 0) return 1;
        return number*factNum(number-1);

    }
}
