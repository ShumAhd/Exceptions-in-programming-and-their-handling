package seminars.Lesson_1ErrorHandling_inProgramming.HW1;

public class HomeWork_Div {

  public static void main(String[] args) {
    DivideArray();
  }

  /**
   Задача.
    Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    и возвращающий новый массив,
    каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
    Если длины массивов не равны,
    необходимо как-то оповестить пользователя.
    Важно: При выполнении метода единственное исключение,
    которое пользователь может увидеть - RuntimeException, т.е. ваше.
   */
  static void DivideArray() {
    try {
      int[] res = getDivideArray(new int[]{-6, 0, 9, 6}, new int[]{2, 2, 10, 0});
      System.out.println("Частное элементов двух массивов (только целые числа)");
      for (int e : res) {
        System.out.printf("%d\t", e);
      }
    } finally {

    }
  }

  /**
   Метод
   1) проверяет массивы на null
   2) проверяет равны ли длины массивов
   3) вычисляет разность двух массивов

   * @param arr1 Первый массив
   * @param arr2 Второй массив
   * @return Результат разности элементов двух массивов
   */
  static int[] getDivideArray(int[] arr1, int[] arr2) {
    if (arr1 == null || arr2 == null) { //проверка на пустоту
      throw new RuntimeException("Оба массива должны существовать.");
    }

    if (arr1.length != arr2.length) { //проверка равности длины массивов
      throw new RuntimeException(
          String.format("Кол-во элементов массива должно быть одинаково.", arr1.length, arr2.length));
    }

    int[] res = new int[arr1.length];
    for (int i = 0; i < arr1.length; i++) {
      if (arr2[i] == 0) // если вдруг решили делить на ноль
      throw new RuntimeException(
          String.format("\n\nДелить на ноль нельзя!!!\nНоль в массиве 2, находится под индексом №: [%d]\n", i));
      res[i] = arr1[i] / arr2[i];
    }
    return res; //результат деления элементов двух массивов.
  }

}

