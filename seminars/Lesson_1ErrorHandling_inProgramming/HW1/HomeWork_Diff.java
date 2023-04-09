package seminars.Lesson_1ErrorHandling_inProgramming.HW1;

public class HomeWork_Diff {

  public static void main(String[] args) {
    DifferencArray();
  }

  /**
   Задача.
   Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
   и возвращающий новый массив,
   каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
   Если длины массивов не равны, необходимо как-то оповестить пользователя.
   */
  static void DifferencArray() {
    try {
      int[] res = getDiffArray(new int[]{1, -2, 9, 1, 4}, new int[]{5, 2, 0, 1});
      System.out.println("Разность элементов двух массивов");
      for (int е : res) {
        System.out.printf("%d\t", е);
      }
      System.out.println();
    } catch (CustomArraySizeException а) {
      System.out.println(а.getMessage());
      System.out.printf("Длина первого массива: %d\nДлина второго массива: %d\n", а.getLength1(),
          а.getLength2());
    }
  }

  /**
    Метод проверяет массивы на null
    проверяет равны ли длины массивов
    вычесляет разность двух массивов
   * @param arr1 Первый массив
   * @param arr2 Второй массив
   * @return Результат разности элементов двух массивов
   */
  static int[] getDiffArray(int[] arr1, int[] arr2) {
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
      res[i] = arr1[i] - arr2[i];
    }
    return res;
  }
}

/**
  Свой класс обработки ошибок связанных с размером массива наследуемый от RuntimeException
 */
class CustomArraySizeException extends RuntimeException {

  int length1; //поле хранит длину первого массива
  int length2;//поле хранит длину второго массива

  /**
    @return возвращает значение поля length1
   */
  public int getLength1() {
    return length1;
  }

  /**
    @return возвращает значение поля length2
   */
  public int getLength2() {
    return length2;
  }

  /**
    Конструктор для расширения конструктора по умолчанию, для того чтоб передать в исключении
    дополнительные данные

    @param message Описание ошибки
    @param length1 Длина первого массива
    @param length2 Длина второго массива
   */
  public CustomArraySizeException(String message, int length1, int length2) {
    super(message); //вызываем конструктор базового типа
    // дополнительная инициализация полей
    this.length1 = length1;
    this.length2 = length2;
  }

}
