/*
Дан следующий код, исправьте его там, где требуется:

public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } catch (Throwable ex) {
       System.out.println("Что-то пошло не так...");
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}

Второе и третье задания не корректны. Исправить их можно по разному.
Я попытался найти наиболее (на мой взгляд) универсальное решение.
 */

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        try {
            int a = new Random().nextInt(2) == 0 ? null : 90;
            int b = 3;
            int[] abc = {1, 2};
            System.out.println(a / b);
            printSum(new Random().nextInt(2) == 0 ? null : 23, 234);
            abc[new Random().nextInt(2) == 0 ? 3 : 1] = 9;
            System.out.println(Arrays.toString(abc));
        }
        catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        }
        catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
        catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
