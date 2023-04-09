package lectures.Lesson_2ExceptionsAndTheirHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AppLication {

  /**
   * Специально создаём разные ошибки для вызова исключений
   *
   * @param args
   */
  public static void main(String[] args) {
    Scanner сканер = new Scanner(System.in);
    //RBTree rbt = new RBTree(Integer.MIN_VALUE);
    char ч;
    do {
      System.out.println("\nСпециально создаём разные ошибки для вызова исключений\n");
      System.out.println("1. NullPointerException (Пустой Объект)");
      System.out.println("2. ClassCastException (Другой тип класса)");
      System.out.println("3. NumberFormatException (Строка как число)");
      System.out.println("4. UnsupportedOperationException (Добавление в лист)");
      System.out.println("5. Try-catch (Перехват и обработка)");
      System.out.println("6. Чтение файла (Try-catch и finally)");

      int choice = сканер.nextInt();
      switch (choice) {
        case 1:
          пустойОбъект(); //Вызываем исключение NullPointerException
          break;
        case 2:
          типКлассаДругой(); //Вызываем исключение ClassCastException
          break;
        case 3:
          строкаКчислу(); //Вызываем NumberFormatException
          break;
        case 4:
          пустойЛист(); //Вызываем UnsupportedOperationException
          break;
        case 5:
          перехватОбработка(); //несколько отдельных исключений
          break;
        case 6:
          чтениеФайла(); // Чтение файла, и finally
          break;
        default:
          System.out.println("Неверный ввод \n ");
          break;
      }
      System.out.println("\nВы хотите продолжить? (введите д или н) \n");
      ч = сканер.next().charAt(0);
    } while (ч == 'Д' || ч == 'д');

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
   * Попытка преобразовать строку к числу, вызов исключения 1. Создаём строку с числом 2. Пытаемся
   * преобразовать её в число NumberFormatException - неверное преобразование строки в числовой
   * формат.
   */
  static void строкаКчислу() {
    String номер = "123fq";
    int результат = Integer.parseInt(номер);
    System.out.println(результат);
  }

  /**
   * Пытаемся добавить в недобовляемый список данные 1. Создаём не добовляемый список 2. Добавляем в
   * список UnsupportedOperationException - указанной операции не существует
   */
  static void пустойЛист() {
    List<Object> пустойЛист = Collections.emptyList();
    пустойЛист.add(new Object());
  }

  /**
   * Используем try-catch, поиск ошибки и перехват try - сюда вставляем код в котором возможна
   * потенциальная ошибка catch - тут происходит перехват исключения с целью обработки 1. Если,
   * разделить на ноль, то перехватим ошибку и вернём "номер" не обновится и вернёт = 1, то есть
   * продолжим работу, без падения программы. 2. Если, ошибки в try нет, то catch не исполняется,
   * пропускается. 3. И будет ловить следующую ошибку в файл = null -> файл.length() 4. Следующая
   * ошибка в add emptyList и если для неё не прописан конкретный перехват, то можно поставить
   * перехват уровнем выше, то есть Exception. 5. Уровень выше всегда должен стоять ниже, уровня
   * ниже)
   */
  static void перехватОбработка() {
    int номер = 1;
    try {
      номер = 10 / 0;
      String файл = null;
      //System.out.println(файл.length());
      Collections.emptyList().add(new Object());
    } catch (ArithmeticException e) {
      System.out.println("Делить на ноль нельзя!!!");
    } catch (NullPointerException е) {
      System.out.println("Файла не существует!!!");
    } catch (Exception e) {
      System.out.println("Все исключения!!!");
    }
    System.out.println(номер);
  }

  /**
   * Исключение при чтении файла 1. Возможность записи нескольких исключений в один catch 2. finally
   * - даже если произошло исключение, всё равно продолжаем выполнять
   */
  static void чтениеФайла() {
    FileReader тест = null;
    try {
      тест = new FileReader(
          "./О_IT/Project/java/Исключения в программировании и их обработка/"
              + "lectures/Lesson_2ExceptionsAndTheirHandling/"
              + "ТестФайл");
      //файл.read();
    } catch (RuntimeException | IOException e) {
      System.out.println("Перехвачено исключение: " + e.getClass().getSimpleName());
    } finally {
      System.out.println("Всё равно продолжаем выполнять");
      if (тест != null) {
        try {
          тест.close();
        } catch (IOException e) {
          System.out.println("Исключение при закрытии");
        }
      }
      System.out.println("наконец-то закончено");
    }
  }
}
