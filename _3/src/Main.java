//Напишите класс, который принимает с клавиатуры целое число и вы-
//водит на экран следующие значения (каждое в отдельной строке): три
//целых числа, следующих за значением, введенным с клавиатуры.
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int num = scanner.nextInt();
        System.out.println("Следующие три числа после " + num + ":");
        for (int i = 1; i <= 3; i++)
        {
            System.out.println(num + i);
        }
    }
}