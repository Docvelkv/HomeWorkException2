/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.
*/


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            try {
                System.out.print("Введите дробное число: ");
                float num = Float.parseFloat(scan.next());
                flag = false;
                System.out.println(num);
            } catch (NullPointerException | NumberFormatException ex) {
                System.out.print("Неправильный ввод. ");
            }
        }
    }
}
