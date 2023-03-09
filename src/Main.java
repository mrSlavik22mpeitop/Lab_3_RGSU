import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {



    public static void main(String[] args)
    {

        System.out.print("Введите размерность массива:");

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] array = new int[size];


        System.out.print("Введите элементы массива:");

        for (int i = 0; i < size; i++) {



                try {

                    if (in.hasNextInt()) {
                        array[i] = in.nextInt();
                    } else if (in.hasNextDouble()) {
                        throw new InputMismatchException("Вы ввели не целое число");



                    } else {
                        throw new InputMismatchException("Вы ввели строку");



                    }


                } catch (InputMismatchException e) {
                    System.out.print(e.getMessage());
                    System.out.println();
                    break;

                }

        }


        System.out.print("Элементы массива:");
        double avg = 0;
        int count = 0;
        boolean jojo_anime = true;
        double result = 0;

        for (int i = 0; i < size; i++)
        {


                if (array[i] > 0)
                {
                    avg = avg + array[i];
                    count = count + 1;
                    result = avg / count;
                    jojo_anime = false;
                }

        }
        for (int i = 0; i < size; i ++)
        {
            System.out.print(" " + array[i]);
        }
        System.out.println();
        try {
            if (!jojo_anime)
            {
                System.out.printf("Среднее значение: %f", result);
            }
            else
            {
                throw new IllegalArgumentException("Нет положительных чисел.");
            }

        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
