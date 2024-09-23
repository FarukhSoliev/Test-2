import java.util.Scanner;

public class Сalculator {
    public Сalculator() {
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true)    {
            System.out.println("Выберите пункт");
            System.out.println("1.Сложение");
            System.out.println("2.Вычеитание");
            System.out.println("3.Умножение");
            System.out.println("4.Деление");
            System.out.println("5.Завершить процесс");
            int person = scanner.nextInt();
            if (person == 5) {
                System.out.println("Программа завершена");
                return;
            }

            int result;
            int a;
            int b;
            if (person == 1) {
                System.out.println("Введите первое число");
                a = scanner.nextInt();
                System.out.println("Введите второе число");
                b = scanner.nextInt();
                System.out.println("a : " + a);
                System.out.println("a :" + b);
                result = a + b;
                System.out.println("Ответ" + result);
            } else if (person == 2) {
                System.out.println("Введите первое число");
                a = scanner.nextInt();
                System.out.println("Введите второе число");
                b = scanner.nextInt();
                System.out.println("a : " + a);
                System.out.println("a :" + b);
                result = a - b;
                System.out.println("Ответ" + result);
            } else if (person == 3) {
                System.out.println("Введите первое число");
                a = scanner.nextInt();
                System.out.println("Введите второе число");
                b = scanner.nextInt();
                System.out.println("a : " + a);
                System.out.println("a :" + b);
                result = a * b;
                System.out.println("Ответ" + result);
            } else if (person == 4) {
                System.out.println("Введите первое число");
                a = scanner.nextInt();
                System.out.println("Введите второе число");
                b = scanner.nextInt();
                if (b == 0) {
                    System.out.println("На ноль делить нельзя");
                }

                System.out.println("a : " + a);
                System.out.println("a :" + b);
                result = a / b;
                System.out.println("Ответ" + result);
            } else {
                System.out.println("Ошибка");
            }
        }
    }
}
