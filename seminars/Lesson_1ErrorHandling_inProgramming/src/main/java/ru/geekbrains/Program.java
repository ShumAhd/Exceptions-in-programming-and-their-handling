package seminars.Lesson_1ErrorHandling_inProgramming.src.main.java.ru.geekbrains;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Program {

  static Scanner scanner = new Scanner(System.in);
  static Random random = new Random();

  public static void main(String[] args) {
    //System.out.printf("Длина массива: %d\n", Task1(new int[]{2, 1, -1, 9, 5}));
    //Task2();
    //task3();
    //task4();
    task5();
  }

  /**
   * Реализуйте метод, принимающий в качестве аргумента целочисленный массив. Если длина массива
   * меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки, иначе -
   * длину массива.
   */
  static int Task1(int[] arr) {
    if (arr == null) {
      return -2;
    }
    if (arr.length == 0) {
      return -1;
    }
    return arr.length;
  }

  /**
   * Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
   * Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например: 1. если
   * длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода
   * ошибки. 2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки. 3. если
   * вместо массива пришел null, метод вернет -3 4. придумайте свои варианты исключительных ситуаций
   * и верните соответствующие коды ошибок. Напишите метод, в котором реализуйте взаимодействие с
   * пользователем. То есть, этот метод запросит искомое число у пользователя, вызовет первый,
   * обработает возвращенное значение и покажет читаемый результат пользователю. Например, если
   * вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.
   */
  static void Task2() {

    while (true) {
      System.out.print("Укажите число для поиска: ");
      if (scanner.hasNextInt()) { //hasNextInt() - возвращает true если с потока ввода можно считать целое число
        int searchNumber = scanner.nextInt(); //nextInt() - считывает целое число с потока ввода
        int[] array = new int[random.nextInt(5) + 1];
          if (random.nextInt(2) == 0) //затираем массив с шансом выпадения 50%
          {
              array = null; //и получаем пустой массив
          }
        if (array != null) {
          for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.printf("%d\t", array[i]);
          }
          System.out.println();
        }

        int coderesult = processArray(array, searchNumber);
        switch (coderesult) {
          case -1 -> System.out.println("Длина массива менее трех элементов.");
          case -2 -> System.out.println("Элемент не найден.");
          case -3 -> System.out.println("Массив некорректно проинициализирован.");
          default -> {
            System.out.println("Массив успешно обработан. Завершение работы приложения.");
            System.out.printf("Элемент найден по индексу: %d\n", coderesult);
            return;
          }
        }

      } else {
        System.out.println("Число для поиска указано некорректно.\nПовторите попытку ввода.");
        scanner.nextLine(); //nextLine() - позволяет считывать целую последовательность символов, то есть строку
      }
    }
  }

  static int processArray(int[] arr, int searchNumber) {
      if (arr == null) {
          return -3; // Массив некорректно проинициализирован
      }
      if (arr.length < 3) {
          return -1; // Длина массива менее трех элементов
      }
    Arrays.sort(arr);
    for (int e : arr) {
      System.out.printf("%d\t", e);
    }
    System.out.println();
    int searchres = Arrays.binarySearch(arr, searchNumber);
      if (searchres < 0) {
          return -2; // Элемент не найден
      }

    return searchres;
  }

  /**
   * Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив. Необходимо
   * посчитать и вернуть сумму элементов этого массива. При этом накладываем на метод 2 ограничения:
   * метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов), и в
   * каждой ячейке может лежать только значение 0 или 1. Если нарушается одно из условий, метод
   * должен бросить RuntimeException с сообщением об ошибке.
   */
  static void task3() {
    for (int i = 0; i < 5; i++) {
      System.out.printf("\n*** Итерация %d ***\n\n", i + 1);
      processArray(generateArray());
    }
  }

  /**
   * Метод обработки массива Ошибки в логике программы, не обнаружимые на этапе компиляции
   * (RuntimeException)
   *
   * @param arr двумерный массив
   * @return
   */
  static void processArray(int[][] arr) {
      for (int i = 0; i < arr.length; i++) {
          if (arr[i].length != arr.length) {
              throw new RuntimeException("Некорректная размерность массива.");
          }
      }
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
          if (arr[i][j] != 0 && arr[i][j] != 1) {
              throw new RuntimeException(
                  String.format("некорректное значение массива по индексу [%d][%d]", i, j));
          } else {
              sum += arr[i][j];
          }
      }
    }
    System.out.printf("Сумма элементов массива: %d\n", sum);
  }

  /**
   * Метод генерации двумерного массива чисел
   *
   * @return двумерный массив
   */
  static int[][] generateArray() {
    int[][] arr = new int[random.nextInt(2)
        + 4][5];//4 или 5 сделано специально, чтоб сгенерировать исключение. 2 это шанс 50/50
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = random.nextInt(2);//генерирую (2) либо 0, либо 1
          if (random.nextInt(100) == 0) {
              arr[i][j] = 2; // Намеренная ошибка, чтоб проверить работу исключения
          }
        System.out.printf("%d ", arr[i][j]);
      }
      System.out.println(); //переход на следующую строку
    }
    return arr;
  }

  /**
   * Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив. Необходимо
   * посчитать и вернуть сумму элементов этого массива. При этом накладываем на метод 2 ограничения:
   * метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов), и в
   * каждой ячейке может лежать только значение 0 или 1. Если нарушается одно из условий, метод
   * должен вернуть код ошибки. Программа должна корректно обработать код ошибки и вывести
   * соответствующее сообщение пользователю. Сравнить такой вариант обработки исключений с
   * предыдущим.
   */
  static void task4() {
    for (int i = 0; i < 5; i++) {
      System.out.printf("\n*** Итерация %d ***\n\n", i + 1);
      int errCode = processArrayV2(generateArray());
      switch (errCode) {
        case -1 -> System.out.println("Некорректная размерность массива.");
        case -2 -> System.out.println("Некорректное значение массива.");
        default -> {
          System.out.printf("Сумма элементов массива: %d\n", errCode);
        }
      }
    }
  }

  static int processArrayV2(int[][] arr) {
      for (int i = 0; i < arr.length; i++) {
          if (arr[i].length != arr.length) {
              return -1;
          }
      }
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
          if (arr[i][j] != 0 && arr[i][j] != 1) {
              return -2;
          } else {
              sum += arr[i][j];
          }
      }
    }
    //System.out.printf("Сумма элементов массива: %d\n", sum);
    return sum;
  }

  /**
   * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий
   * новый массив, каждый элемент которого равен сумме элементов двух входящих массивов в той же
   * ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
   * <p>
   * Домашнее задание:
   * <p>
   * 3. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и
   * возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих
   * массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить
   * пользователя.
   * <p>
   * 4. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и
   * возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих
   * массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить
   * пользователя. Важно: При выполнении метода единственное исключение, которое пользователь может
   * увидеть - RuntimeException, т.е. ваше.
   */

  static void task5() {
    try {
      int[] res = getSumArray(new int[]{1, -2, 9, 1}, new int[]{5, 2, 0, 1});
      for (int e : res) {
        System.out.printf("%d\t", e);
      }
      System.out.println();
    } catch (CustomArraySizeException e) {
      System.out.println(e.getMessage());
      System.out.printf("Длина первого массива: %d\nДлина второго массива: %d\n", e.getLength1(),
          e.getLength2());
    }
  }

  static int[] getSumArray(int[] arr1, int[] arr2) {
      if (arr1 == null || arr2 == null) {
          throw new NullPointerException("Оба массива должны существовать.");
          //NullPointerException - это исключения, возникающие при попытке использовать ссылку,
          // которая не указывает ни на какое место в памяти (null)
      }

      if (arr1.length != arr2.length) {
          throw new CustomArraySizeException("Кол-во элементов массива должно быть одинаково.",
              arr1.length, arr2.length);
      }
    int[] res = new int[arr1.length];
    for (int i = 0; i < arr1.length; i++) {
      res[i] = arr1[i] + arr2[i];
    }
    return res;
  }


}

/**
 * Свой класс обработки ошибок связанных с размером массива наследуемый от RuntimeException
 */
class CustomArraySizeException extends RuntimeException {


  int length1; //поле хранит длину первого массива
  int length2;//поле хранит длину второго массива

  /**
   * @return возвращает значение поля length1
   */
  public int getLength1() {
    return length1;
  }

  /**
   * @return возвращает значение поля length2
   */
  public int getLength2() {
    return length2;
  }

  /**
   * Конструктор для расширения конструктора по умолчанию, для того чтоб передать в исключении
   * дополнительные данные
   *
   * @param message Описание ошибки
   * @param length1 Длина первого массива
   * @param length2 Длина второго массива
   */
  public CustomArraySizeException(String message, int length1, int length2) {
    super(message); //вызываем конструктор базового типа
      // дополнительная инициализация полей
    this.length1 = length1;
    this.length2 = length2;
  }

}
