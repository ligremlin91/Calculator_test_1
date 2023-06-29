import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class Main {
    public static void main(String[] args) {
        System.out.println("Укажите уравнение:");
        Scanner inp = new Scanner(System.in);
        String input = inp.next();
        var numbers = input.replaceAll("\\D", " $0 ").split(" ");

        int num1 = parseInt(numbers[0]);
        String choose = numbers[1];
        int num2 = parseInt(numbers[2]);

        if (num1 >10 || num2 > 10){
            throw new Error("Заданные числа больше 10!");
        }

        switch (choose) {
            case "+" -> System.out.println(plus(num1, num2));
            case "-" -> System.out.println(minus(num1, num2));
            case "*" -> System.out.println(multiply(num1, num2));
            case "/" -> System.out.println(divide(num1, num2));
            default -> System.out.println("Невозможное действие");
        }

    }
    public static int plus(int x, int y)
    {
        return x+y;
    }
    public static int minus(int x, int y)
    {
        return x-y;
    }
    public static int multiply(int x, int y)
    {
        return x*y;
    }
    public static int divide(int x, int y)
    {
        return x/y;
    }

}