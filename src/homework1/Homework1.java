package homework1;

public class Homework1 {
    public static void main(String[] args) {
//ЗАДАЧА 1
/*2. Задача на тернарный оператор
Даны переменные типа long start и end.
Если start меньше end между присвоить значение end - start, в противном случае -1
 */
long start = 1;
long end = 25;
boolean res = start < end;
System.out.println(start<end);
long between = start < end ? end - start : -1;
System.out.println(between);
// ЗАДАЧА 2
/*
Задача на арифметические операторы
Найти сумму цифр 2х значного числа
 */
int number =87,a,b,c;
a = number/10;
b = number%10;
System.out.println(a+b);
//ЗАДАЧА 3
/*
Задача на арифметические операторы
Найти сумму цифр 3х значного числа
 */
int num =153;
a = num/100;
b = num/10%10;
c = num%10;
System.out.println(a+b+c);













    }

}
