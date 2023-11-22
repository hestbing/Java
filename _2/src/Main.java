//Напишите класс, который присваивает переменной х значение 6,
// а затем выводит на экран: в первой строке - это значение, во второй
// квадрат этого значения, в третьей - куб этого значения.
public class Main
{
    public static void main(String[] args)
    {
        int x = 6;
        System.out.println("Значение x: " + x);
        System.out.println("Квадрат значения x: " + (x*x));
        System.out.println("Куб значения x: " + (x*x*x));
    }
}