package homework2;
import java.util.Random;
import java.util.Scanner;
public class Homework2 {
    public static void main(String[] args) {
//ЗАДАНИЕ 1
 /*1. Задача на if
Дана целочисленная переменная count - количество верных ответов.
В зависимости от значения этой переменной вывести в консоль оценку:
100 - 90 правильных ответов - отлично
89 - 60 правильных ответов - хорошо
59 - 40 правильных ответов - удовлетворительно
39 - 0 правильных ответов - попробуйте в следующий раз
*/
     int count = 61;
     if (count >= 90 && count <= 100) {
      System.out.println("Отлично");
     } else {
      if (count >= 60 && count <= 89) {
       System.out.println("Хорошо");
      } else {
       if (count >= 40 && count <= 59) {
        System.out.println("Нормально");
       } else {
        if (count >= 0 && count <= 39) {
         System.out.println("Попробуйте в следующий раз");
        }
       }
      }
     }
//ЗАДАНИЕ 2
 /*2. Задача на switch
Пользователь вводит 3 числа:
1е - первый операнд
2e - второй операнд
3е - оператор
В зависимости от третьего введенного числа нужно вывести в консоль:
сумму, разность, умножение, деления чисел, которые ввел пользователь.
Если 3е введенное число 3, нужно найти сумму,
если 5 - разность,
если 7 - результат умножения,
если 9 - результат деления.
*/
     Scanner in = new Scanner(System.in);
     System.out.println("введите команду");
     int op = in.nextInt();
     System.out.println(op);
     int first, second;
     first = 50;
     second = 100;
     switch (op) {
      case 3 -> System.out.println(second + first);
      case 5 -> System.out.println(second - first);
      case 7 -> System.out.println(second * first);
      case 9 -> System.out.println(second / first);
     }
//ЗАДАНИЕ 3
     /*
     3. Задача на цикл while
Считать с консоли количество тарелок и количество моющего средства
Моющее средство расходуется из расчета 0.5 на 1 тарелку
В цикле выводить сколько моющего средства осталось после мытья каждой тарелки.
В конце вывести сколько тарелок осталось, когда моющее средство закончилось или
наоборот.
      */
     int plates = 10;
     float synergetic = 5;
     while (plates > 0 && synergetic > 0) {
      synergetic -= 0.5;
      --plates;
      System.out.println("Осталось средства:" + synergetic + "," + "Осталось тарелок:" + plates);
     }
//ЗАДАНИЕ  4
     /*
     Программа загадывает число в диапазоне [1;9]
Пользователь вводит число с клавиатуры
Программа в зависимости от введенного числа выводит в консоль следующее:
"загаданное число больше"
"загаданное число меньше"
"Вы угадали" (программа завершает работу)
если введен 0, выводит "выход из программы" (программа завершает работу)
      */
     int comp, user;
     comp = (int) (Math.random() * 9) + 1;
     System.out.println("Я программа и загадала число от 1 до 9, отгадайте его. ");
     System.out.println("Вводите ваше число: ");
     Scanner input = new Scanner(System.in);
     if (input.hasNextInt()) {
      do {
       user = input.nextInt();
       if (user == comp) {
        System.out.println("Вы угадали! ");
       } else {
        if (user > 0 && user <= 9) {
         System.out.println("Вы не угадали! ");
         if (comp < user) {
          System.out.println("Загаданное число меньше ");
         } else {
          System.out.println("Загаданное число больше ");
         }
        }
       }
      } while (user != comp);
     }
     System.out.println("До свиданья");
//ЗАДАНИЕ 5
     /*
     Задача на Math.random() и if
Написать код, который будет проверять попало ли случайно сгенерированное целое число из отрезка [10;500]
в интервал (25;200) и выводить результат в консоль.
Примеры работы программы:
Число 345 не содержится в интервале (25;200)
Число 110 содержится в интервале (25;200)
      */
     int min = 10;
     int max = 500;
     int randNum = (int) (Math.random() * min + Math.random() * max);
     System.out.println("Случайное число:" + randNum);
     if (randNum >= 25 && randNum <= 250) {
      System.out.println("Число " + randNum + " содержится в интервале (25,250)");
     } else {
      System.out.println("Число " + randNum + " не содержится в интервале (25,250)");
     }
//ЗАДАНИЕ 6
     /*
     Пользователь!!! загадывает число в диапазоне от [1 до 100]
Программа пытается его угадать (используйте метод !!!бинарного поиска - деление отрезка на 2).
Программа может задавать пользователю вопросы:
Число равно ...? / Число больше ...? / Число меньше ...? и в зависимости от ответа пользователя принимать решения.
Число равно ...? / Число больше ...? / Число меньше ...?
и в зависимости от ответа пользователя принимать решения.
!!! Вместо текстовых ответов ДА/НЕТ, используйте числа 0 - НЕТ и 1 - ДА
      */
     System.out.println("Загадайте число от 1 до 100");
     int point = 50, half = 25, say;
     while (half > 0) {
      System.out.println("Вы загадали число " + point + " ? 0 - нет, 1 - да");
      say = in.nextInt();
      if (say == 1) {
       System.out.println("Мы угадали!");
       break;
      }
      System.out.println("Ваше число больше чем " + point + " ? 0 - нет, 1 - да");
      say = in.nextInt();
      if (say == 1) {
       point += half;
      } else {
       point -= half;
      }
      half /= 2;
      half++;
     }
    }
}






