package com.MainAcademy.Petrick;

/*
Домашнее задание №1
студента Петрик Андрея petrickandrew@gmail.com
по курсу "Атоматизированного тестирования" Main Academy
проверяющий Генадий Мирошниченко.

Задание:
  Объявить переменную name типа String.
 Сразу же в строке объявления присвоить ей какое-нибудь значение.
 Выведи на экран переменную name.

 */
/*
public class HomeTask {
    public static void main(String[] args) {
        String name = "Поехали!", gagarin="       Юрий Гагарин.", str = "\u2122" ;

        System.out.println(name);
        System.out.print(gagarin);
        System.out.print(str);
    }
}
*/
//-------------------------------------------------------------------------------------------------------------------
/*
Домашнее задание №2
студента Петрик Андрея petrickandrew@gmail.com
по курсу "Атоматизированного тестирования" Main Academy
проверяющий Генадий Мирошниченко.

Задание:
 Написать программу, которая считывает с клавиатуры целое число a и выводит квадрат этого числа (a * a).
Для считывания данных с клавиатуры использовать метод nextInt() класса Scanner.

Требования:
1. Программа должна выводить текст.
2. В программе необходимо создать объект типа Scanner.
3. Программа должна считывать данные с клавиатуры.
4. Программа должна выводить квадрат считанного числа.
*/
/*
import java.util.Scanner;

public class HomeTask {
    public static void main(String[] args) {

        String StringCorrect =   "  Вы ввели число = ";
        String StringRequest =   "  Введите число, которое нужно возвести в квадрат ";
        String StringSqr     =   "  Квадрат введенного числа равен = ";
        String probel = " ";

        int Digital =0;
        Scanner stdin;
        //---------------------------------

        stdin = new Scanner(System.in);

        System.out.println(StringRequest);
        Digital = stdin.nextInt();

        System.out.println(StringCorrect + probel + Digital );
        System.out.println(StringSqr + Digital * Digital);

        }
}
*/
//-------------------------------------------------------------------------------------------------
/*
Домашнее задание №3
студента Петрик Андрея petrickandrew@gmail.com
по курсу "Атоматизированного тестирования" Main Academy
проверяющий Генадий Мирошниченко.

Задание:
расставить правильно знаки плюс и минус, чтобы значение переменной result
получилось равным 20.

public class Solution {
public static int a = 1;
public static int b = 3;
public static int c = 9;
public static int d = 27;
public static void main(String[] args) {
                                   int result = + a + b + c + d;
                                    System.out.println(result);
                                       }
                      }
Требования:
1. Значения переменных: a, b, c, d не изменяй.
2. Перед каждой из переменных: a, b, c, d в строке с объявлением
переменной result должен стоять один знак плюс либо минус.
3. В результате работы программы на экран нужно вывести число 20.
4. Знаки плюс и минус должны быть расставлены правильно
*/
/*
public class HomeTask {
    public static int a = 1;
    public static int b = 3;
    public static int c = 9;
    public static int d = 27;
    public static void main(String[] args) {

        int result = -a + b - c + d;
        System.out.println(result);
    }
}
*/
//----------------------------------------------------------------------------
/*
Домашнее задание №4
студента Петрик Андрея petrickandrew@gmail.com
по курсу "Атоматизированного тестирования" Main Academy
проверяющий Генадий Мирошниченко.

Задание:
Закомментировать часть кода, чтобы на экран вывелось сообщение «summa =
        12»
public class Solution {
    public static void main(String[] args) {
        int a = 3;
        int a = 10;
        int b = 6;
        int b = 12;
        int summa = 1 + a + b;
        int summa = 2 + a + b;
        int summa = 3 + a + b;
        int summa = 4 + a + b;
        System.out.println("summa = " + summa);
    }
}
Требования:
        1. Программа должна выводить на экран текст.
        2. Нужно закомментировать необходимые строки и не менять остальные.
        3. В программу нельзя добавлять новые строки или удалять имеющиеся.
        4. Выведенный текст должен соответствовать заданию.
*/
/*
public class HomeTask {

    public static void main(String[] args) {
        int a = 3;
       // int a = 10;
        int b = 6;
      //  int b = 12;
       // int summa = 1 + a + b;
       // int summa = 2 + a + b;
        int summa = 3 + a + b;
       // int summa = 4 + a + b;
        System.out.println("summa = " + summa);
    }
}
*/
//---------------------------------------------------------------------------------
/*
Домашнее задание №5
студента Петрик Андрея petrickandrew@gmail.com
по курсу "Атоматизированного тестирования" Main Academy
проверяющий Генадий Мирошниченко.

Задание:
Объявить недостающие переменные и закомментировать те, которые нигде не
используются.
public class Solution {
       public static void main(String[] args) {
                                         String s = "15";
                                         a = 5;
                                         int z = 18;
                                         int d = 18;
                                         c = a + d;
                                         b = " better then ";
                                         System.out.println(a + b + c);
                                              }
                      }
*/
/*
public class HomeTask {

    public static void main(String[] args) {
                                            //String s = "15";
                                            int a = 5;
                                            //int z = 18;
                                            int d = 18;
                                            int c = a + d;
                                            String b = " better then ";
                                            System.out.println(a + b + c);
    }
}
*/
//-------------------------------------------------------------------------------
/*
Домашнее задание №6
студента Петрик Андрея petrickandrew@gmail.com
по курсу "Атоматизированного тестирования" Main Academy
проверяющий Генадий Мирошниченко.

Задание:
Реализовать метод print. Метод должен вывести на экран переданную строку
4 раза. Каждый раз с новой строки.
Требования:
1. Программа должна выводить текст на экран.
2. Метод main не должен вызывать System.out.println или System.out.print.
3. Метод print должен выводить текст на экран.
4. Метод main должен вызвать метод print класса только один раз.
5. Метод print должен выводить на экран строку 4 раза. Каждый раз с новой
строк

*/
