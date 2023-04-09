package lectures.Lesson_2ExceptionsAndTheirHandling;

import java.io.File;

public class AppLication {

  /**
   * Специально создаём разные ошибки для вызова исключений
   *
   * @param args
   */
  public static void main(String[] args) {
    ПустойОбъект(); //Вызываем исключение NullPointerException
    //ТипКлассаДругой(); //Вызываем исключение ClassCastException
    //СтрокаКчислу();
  }

  /**
   * Создаём объект со значением "ничего нет" обращаемся к объекту и хотим узнать длину массива
   * NullPointerException s-это исключения, возникающие при попытке использовать ссылку, которая не
   * указывает ни на какое место в памяти (null)
   */
  static void ПустойОбъект() {
    String имя = null;
    System.out.println(имя.length());
  }

  /**
   * Преобразуем объект типа string к объекту типа file ClassCastException-это исключение, которое
   * может возникнуть при попытке неправильного преобразования класса из одного типа в другой.
   */
  static void ТипКлассаДругой() {
    Object object = new String("123");
    File файл = (File) object;
    System.out.println(файл);
  }

  /**
   * Попытка преобразовать строку к числу, вызов исключения
   * 1. Создаём строку с числом
   * 2. Пытаемся преобразовать её в число
   * NumberFormatException - неверное преобразование строки в числовой формат.
   */
  static void СтрокаКчислу() {
    String номер = "123fq";
    int результат = Integer.parseInt(номер);
    System.out.println(результат);
  }
}
