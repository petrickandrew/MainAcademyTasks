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


