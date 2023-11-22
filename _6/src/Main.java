//Напишите метод, который получает в качестве параметра два числа
//(А и В) и выводит на экран все четные числа из диапазона А ... В.
public class Main
{
    public static void main(String[] args)
    {
        int A = 5;
        int B = 15;
        printEvenNumbersInRange(A, B);
    }
    static void printEvenNumbersInRange(int A, int B)
    {
        System.out.println("Четные числа в диапазоне от " + A + " до " + B + ":");
        for (int i = A; i <= B; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println(i);
            }
        }
    }
}