package lectures.Lesson_2ExceptionsAndTheirHandling;

import java.io.File;
import java.util.Collections;
import java.util.List;

public class AppLication {

  /**
   * Специально создаём разные ошибки для вызова исключений
   * @param args
   */
  public static void main(String[] args) {
    //пустойОбъект(); //Вызываем исключение NullPointerException
    //типКлассаДругой(); //Вызываем исключение ClassCastException
    //строкаКчислу(); //Вызываем NumberFormatException
    пустойЛист(); //Вызываем UnsupportedOperationException
  }

  /**
   * Создаём объект со значением "ничего нет" обращаемся к объекту и хотим узнать длину массива
   * NullPointerException s-это исключения, возникающие при попытке использовать ссылку, которая не
   * указывает ни на какое место в памяти (null)
   */
  static void пустойОбъект() {
    String имя = null;
    System.out.println(имя.length());
  }

  /**
   * Преобразуем объект типа string к объекту типа file ClassCastException-это исключение, которое
   * может возникнуть при попытке неправильного преобразования класса из одного типа в другой.
   */
  static void типКлассаДругой() {
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
  static void строкаКчислу() {
    String номер = "123fq";
    int результат = Integer.parseInt(номер);
    System.out.println(результат);
  }

  /**
   * Пытаемся добавить в недобовляемый список данные
   * 1. Создаём не добовляемый список
   * 2. Добовляем в список
   * UnsupportedOperationException - указанной операции не существует
   */
  static void пустойЛист(){
    List<Object> пустойЛист = Collections.emptyList();
    пустойЛист.add(new Object());
  }
}
