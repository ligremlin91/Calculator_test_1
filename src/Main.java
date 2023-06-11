import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Укажите первое и второе число:");
        Scanner inp= new Scanner(System.in);
        int num1,num2;
        num1 = inp.nextInt();
        num2 = inp.nextInt();
        System.out.println("Укажите операцию: 1 Сложение, 2 Вычитание 3 Умножение и 4 Деление:");
        int choose;
        choose = inp.nextInt();
        switch (choose){
            case 1:
                System.out.println(add( num1,num2));
                break;
            case 2:
                System.out.println(sub( num1,num2));
                break;
            case 3:
                System.out.println(mult( num1,num2));
                break;
            case 4:
                System.out.println(div( num1,num2));
                break;
            default:
                System.out.println("Невозможное действие");


        }



    }
    public static int add(int x, int y)
    {
        int result = x+y;
        return result;
    }
    public static int sub(int x, int y)
    {
        int result = x-y;
        return result;
    }
    public static int mult(int x, int y)
    {
        int result = x*y;
        return result;
    }
    public static int div(int x, int y)
    {
        int result = x/y;
        return result;
    }

}