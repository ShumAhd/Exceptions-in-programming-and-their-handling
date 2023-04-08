package lectures.Lesson_1ErrorHandlingInProgramming;

import java.io.File;

public class AppLication {

  /**
   * Функция для возврата размера файла
   *
   * @param args
   */
  public static void main(String[] args) {
    //System.out.println(getFileSize(new File("/О_IT/Project/java/Исключения в программировании и их обработка (лекции)/Exceptions-in-programming-and-their-handling-lectures-/README.md")));

    System.out.println(getFileSize(new File
        ("/О_IT/Project/java"
            + "/Исключения в программировании и их обработка (лекции)"
            + "/Exceptions-in-programming-and-their-handling-lectures-"
            + "/Lesson_1ErrorHandlingInProgramming/TestFile")));
    System.out.println(divide(10, 0));
    a1();

  }

  //функция деления на ноль
  public static int divide(int a, int b) {
    //обработчик ошибки деления на ноль
    if (b == 0) {
      throw new RuntimeException("Делить на ноль нельзя");
    }
    return a / b;
  }

  //long-так обозначается размер файла, в функцию передаём объект файл (File file)
  public static long getFileSize(File file) {
    //добавим обработчик ошибки, если файл не существует
    if (!file.exists()) {
      return -1L;
    }
    return file.length();
    //по умолчанию у файла уже есть информация о размере length
  }

  public static void a1() {
    a2();
  }

  public static void a2() {
    a3();
  }

  public static void a3() {
    //Массив размером 10, а запрос на 1000, для просмотра ошибки в стектрейсе.
    int[] ints = new int[10];
    System.out.println(ints[1000]);
  }
}