
[![Typing SVG](https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=40&pause=1000&width=1100&height=70&lines=%D0%98%D1%81%D0%BA%D0%BB%D1%8E%D1%87%D0%B5%D0%BD%D0%B8%D1%8F+%D0%B2+%D0%BF%D1%80%D0%BE%D0%B3%D1%80%D0%B0%D0%BC%D0%BC%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B8++%D0%B8+%D0%B8%D1%85+%D0%BE%D0%B1%D1%80%D0%B0%D0%B1%D0%BE%D1%82%D0%BA%D0%B0)](https://git.io/typing-svg)

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

### [Урок 2. Исключения и их обработка](https://github.com/ShumAhd/Exceptions-in-programming-and-their-handling/tree/main/seminars/Lesson_2ExceptionsAndTheirHandling)

- [Program.java](https://github.com/ShumAhd/Exceptions-in-programming-and-their-handling/blob/main/seminars/Lesson_2ExceptionsAndTheirHandling/src/main/java/ru/geekbrains/lesson2/Program.java)
  Классная работа

### Домашняя работа к семинару 2

[HW2.java](https://github.com/ShumAhd/Exceptions-in-programming-and-their-handling/blob/main/seminars/Lesson_2ExceptionsAndTheirHandling/src/main/java/ru/geekbrains/lesson2/HW2.java)

  1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

  2. Если необходимо, исправьте данный код (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

  3. Дан следующий код, исправьте его там, где требуется (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.









