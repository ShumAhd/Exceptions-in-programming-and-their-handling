package lectures.Lesson_2ExceptionsAndTheirHandling;

import java.io.File;

public class AppLication {

  /**
   * Специально создаём разные ошибки для вызова исключений
   * @param args
   */
  public static void main(String[] args) {
    //NullPointerException1(); //Вызываем исключение NullPointerException
    ClassCastException1(); //Вызываем исключение ClassCastException
  }

  /**
    Создаём объект со значением "ничего нет"
    обращаемся к объекту и хотим узнать длину массива
    NullPointerException s-это исключения,
    возникающие при попытке использовать ссылку,
    которая не указывает ни на какое место в памяти (null)
   */
  static void NullPointerException1() {
    String name = null;
    System.out.println(name.length());
  }

  /**
    Преобразуем объект типа string к объекту типа file
    ClassCastException-это исключение,
    которое может возникнуть при попытке неправильного преобразования
    класса из одного типа в другой.
   */
  static void ClassCastException1(){
    Object object = new String("123");
    File file = (File) object;
    System.out.println(file);
  }
}
