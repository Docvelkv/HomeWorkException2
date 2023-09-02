/*
Если необходимо, исправьте данный код:
try {
   int d = 0;
   double caughtRes1 = intArray[8] / d;
   System.out.println("caughtRes1 = " + caughtRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}
 */

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int d = new Random().nextInt(2);
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        try {
            int caughtRes1 = intArray[8] / d;
            System.out.println("caughtRes1 = " + caughtRes1);
        }
        catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e.getClass().getName() + ": " + e.getMessage());
        }
    }
}
