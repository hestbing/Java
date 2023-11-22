//Напишите класс, который принимает с клавиатуры два числа: первое -
//количество учеников в классе, второе - количество стульев в классной
//комнате. Программа проверит соответствие между этими двумя значениями и
//выведет на экран соответствующую информацию (например,
// для значений 35 и 39 на экран выводится 4 стула лишних).
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество учеников в классе: ");
        int stud = scanner.nextInt();
        System.out.print("Введите количество стульев в классе: ");
        int chair = scanner.nextInt();
        int diff_1 = chair - stud;
        int diff_2 = stud - chair;
        if (diff_1 >= 0)
        {
            System.out.println(diff_1 + " лишних стула.");
        }
        else
        {
            System.out.println(diff_2 + " стула недостает.");
        }
    }
}