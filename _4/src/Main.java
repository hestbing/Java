//Напишите класс, который сначала заносит в переменную строковое
//значение Привет, а затем принимает с клавиатуры ваше имя.
//Класс должен вывести на экран в одной строке сообщение,
//составленное из строкового значения Привет, знака «запятая» и вашего имени.
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String hello = "Привет";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();
        String helloname = hello + ", " + name;
        System.out.println(helloname);
    }
}