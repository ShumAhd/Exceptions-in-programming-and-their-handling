package seminars.Lesson_2ExceptionsAndTheirHandling.HW2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HW2 {

  public static void main(String[] args) {
    //processingEnteredData(); // Задача 1
    //task2(); // Задача 2
    //task2_2(); // Задача 2.2
    task3(); // Задача 3

  }

  /**
   * Задача 1
   * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
   * и возвращает введенное значение.
   * Ввод текста вместо числа не должно приводить к падению приложения,
   * вместо этого, необходимо повторно запросить у пользователя ввод данных.
   * @return возвращает введённое число
   */
  public static float floatnum() {

    System.out.println("\nВведите дробное число через запятую: ");
    Scanner sc = new Scanner(System.in);
    float num = sc.nextFloat();
    System.out.println("Вы ввели:\n" + (num));
    return num;
  }

  /**
   * Исключение если, введена строка или число через точку
   * @return
   */
  private static float processingEnteredData() {
    try {
      floatnum();
    } catch (InputMismatchException e) {
      System.out.println("Неверный ввод!");
      processingEnteredData();
    }
    return 0;
  }

  /**
   * Задача 2.1
   * Исправить код, добавил массив
   */
  public static void task2() {
    try {
      int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 10};
      int d = 0;
      double catchedRes1 = intArray[8] / d;
      System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
      System.out.println("Catching exception: " + e);
    }

  }

  /**
   * Задача 2.1 исправить код
   * Перенёс в низ Throwable, так как он стоит выше по иерархии
   */
  public static void task2_2() {
    try {
      int a = 90;
      int b = 3;
      System.out.println(a / b);
      printSum(23, 234);
      int[] abc = {1, 2};
      abc[3] = 9;

    } catch (NullPointerException ex) {
      System.out.println("Указатель не может указывать на null!");
    } catch (IndexOutOfBoundsException ex) {
      System.out.println("Массив выходит за пределы своего размера!");
    } catch (Throwable ex) {
      System.out.println("Что-то пошло не так...");
    }
  }

  public static void printSum(Integer a, Integer b) {
    System.out.println(a + b);
  }

  /**
   * Задача 3
   *  Разработайте программу,
   *  которая выбросит Exception,
   *  когда пользователь вводит пустую строку.
   *  Пользователю должно показаться сообщение,
   *  что пустые строки вводить нельзя.
   * @return возвращает введённую строку
   */
  public static String task3() {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    if(str.isEmpty())
      throw new IllegalArgumentException("Пустые строки вводить нельзя!");
    else
      System.out.println(str);
    return str;
  }
}
