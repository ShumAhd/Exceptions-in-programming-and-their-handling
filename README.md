# Исключения в программировании и их обработка

## [Исключения в программировании и их обработка (лекции)](https://github.com/ShumAhd/Exceptions-in-programming-and-their-handling/tree/main/lectures)
[Урок 1. Обработка ошибок в программировании](https://github.com/ShumAhd/Exceptions-in-programming-and-their-handling/tree/main/lectures/Lesson_1ErrorHandlingInProgramming)

[Урок 2. Исключения и их обработка](https://github.com/ShumAhd/Exceptions-in-programming-and-their-handling/tree/main/lectures/Lesson_2ExceptionsAndTheirHandling)

- [AppLication.java](https://github.com/ShumAhd/Exceptions-in-programming-and-their-handling/blob/main/lectures/Lesson_2ExceptionsAndTheirHandling/AppLication.java)

  Код из лекции урока 2, с добавлением меню и небольшим извращением)
  
  Пример вывода в терминал

```
 Cпециально создаём разные ошибки для вызова исключений

1. NullPointerException (Пустой Объект)
2. ClassCastException (Другой тип класса)
3. NumberFormatException (Строка как число)
4. UnsupportedOperationException (Добавление в лист)
5. Try-catch (Перехват и обработка)
6. Чтение файла (Try-catch и finally)
1
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "имя" is null
	at lectures.Lesson_2ExceptionsAndTheirHandling.AppLication.пустойОбъект(AppLication.java:67)
	at lectures.Lesson_2ExceptionsAndTheirHandling.AppLication.main(AppLication.java:33)
```

## [Исключения в программировании и их обработка (семинары)](https://github.com/ShumAhd/Exceptions-in-programming-and-their-handling/tree/main/seminars)
### [Урок 1. Обработка ошибок в программировании](https://github.com/ShumAhd/Exceptions-in-programming-and-their-handling/tree/main/seminars/Lesson_1ErrorHandling_inProgramming/src/main/java/ru/geekbrains)
- [Program.java](https://github.com/ShumAhd/Exceptions-in-programming-and-their-handling/blob/main/seminars/Lesson_1ErrorHandling_inProgramming/src/main/java/ru/geekbrains/Program.java)
  
  Классная работа
#### [Домашняя работа к уроку 1](https://github.com/ShumAhd/Exceptions-in-programming-and-their-handling/tree/main/seminars/Lesson_1ErrorHandling_inProgramming/HW1)

- [HomeWork_Diff.java](https://github.com/ShumAhd/Exceptions-in-programming-and-their-handling/blob/main/seminars/Lesson_1ErrorHandling_inProgramming/HW1/HomeWork_Diff.java)

    Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.


- [HomeWork_Div.java](https://github.com/ShumAhd/Exceptions-in-programming-and-their-handling/blob/main/seminars/Lesson_1ErrorHandling_inProgramming/HW1/HomeWork_Div.java)

    Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.









