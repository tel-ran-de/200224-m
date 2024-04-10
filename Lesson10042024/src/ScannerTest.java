import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите радиус окружности ");
        int radius = scanner.nextInt();
        System.out.println("S = " + Math.PI * radius * radius);
//        System.out.println(Math.pow(radius, 5));

//        System.out.println("введите x ");
//        int x = scanner.nextInt();
//        System.out.println("введите y ");
//        int y = scanner.nextInt();
//        int result = 5 * x + 10 * y;
//        System.out.println("5x + 10y = " + result);

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите первое число: ");
//        long firstNumber = scanner.nextLong();
//
//        System.out.println("Введите второе число: ");
//        long secondNumber = scanner.nextLong();
//
//        System.out.println("Введите math operation(+, -, *, /): ");
//        char operation = scanner.next().charAt(0);
//
//        if (operation == '+') {
//            System.out.println("Сумма: " + (firstNumber + secondNumber));
//        }
//        if (operation == '-') {
//            System.out.println("Разность: " + (firstNumber - secondNumber));
//        }
//        if (operation == '*') {
//            System.out.println("Произведение: " + (firstNumber * secondNumber));
//        }
//        if (operation == '/') {
//            System.out.println("Частное: " + (firstNumber / secondNumber));
//        }


//        System.out.println("Сумма: " + (firstNumber + secondNumber));
//        System.out.println("Разность: " + (firstNumber - secondNumber));
//        System.out.println("Произведение: " + (firstNumber * secondNumber));
//        System.out.println("Частное: " + (firstNumber / secondNumber));
    }
}
