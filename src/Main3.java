import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите числа\n => ");
        String[] input = sc.nextLine().split(" ");
        sc.close();
        switch (input[1]) {
            case "+" -> System.out.println(Float.parseFloat(input[0]) + Float.parseFloat(input[2]));
            case "-" -> System.out.println(Float.parseFloat(input[0]) - Float.parseFloat(input[2]));
            case "*" -> System.out.println(Float.parseFloat(input[0]) * Float.parseFloat(input[2]));
            case "/" -> {
                if ((Float.parseFloat(input[2])) != 0) System.out.println("На ноль делить нельзя");
                else System.out.println(Float.parseFloat(input[0]) / Float.parseFloat(input[2]));
            }
            default -> {
            }
        }
    }
}
