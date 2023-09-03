/*
Разработайте программу, которая выбросит Exception,
когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Введите текст: ");
            String str = scan.nextLine();
            if (!str.isEmpty()) System.out.println(str);
            else throw new Exception("Пустые строки вводить нельзя");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
