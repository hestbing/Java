//Напишите класс, который заполняет случайными четырехзначными
//числами массив, размер которого при инициализации вводится с клавиатуры.
//После заполнения класс должен вывести на экран значения массива в
//одной строке, начиная с «конца>> массива (с последней ячейки).
import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int arrSize = scanner.nextInt();
        int[] arr = generateArr(arrSize);
        printArr(arr);
    }
    static int[] generateArr(int size)
    {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++)
        {
            arr[i] = 1000 + random.nextInt(9000);
        }
        return arr;
    }
    static void printArr(int[] arr)
    {
        System.out.println("Элементы массива начиная с конца:");
        for (int i = arr.length - 1; i >= 0; i--)
        {
            System.out.print(arr[i] + " ");
        }
    }
}