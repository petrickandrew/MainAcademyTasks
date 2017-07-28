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
//----------------------------------------------------------------------------

