package homework2;
import java.util.Random;
import java.util.Scanner;
public class Homework2 {
    public static void main(String[] args) {
//ЗАДАНИЕ 1
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
Scanner in = new Scanner(System.in);
System.out.println("введите команду");
int op = in.nextInt();
System.out.println(op);
int first,second;
first = 50;
second = 100;
switch(op){
    case 3 -> System.out.println(second+first);
    case 5 -> System.out.println(second-first);
    case 7 -> System.out.println(second*first);
    case 9 -> System.out.println(second/first);
}
//ЗАДАНИЕ 3
int plates = 10;
float synergetic = 5;
while (plates > 0 && synergetic > 0) {
synergetic -=0.5;
--plates;
System.out.println("Осталось средства:"+synergetic+"," +"Осталось тарелок:"+plates );
}
//ЗАДАНИЕ  4
int comp,user;
comp = (int) (Math.random()*9) + 1;
 System.out.println("Я программа и загадала число от 1 до 9, отгадайте его. ");
 System.out.println("Вводите ваше число: ");
 Scanner input = new Scanner(System.in);
if (input.hasNextInt()) {
do {
user = input.nextInt();
if(user == comp) {
System.out.println("Вы угадали! ");
 } else {
 if (user > 0 && user <= 9) {
 System.out.println("Вы не угадали! ");
  if (comp < user) {
 System.out.println("Загаданное число меньше ");
 }else{
  System.out.println("Загаданное число больше ");
 }
 }
 }
 } while(user !=comp);
 }
 System.out.println("До свиданья");
//ЗАДАНИЕ 5
int min = 10;
int max = 500;
int randNum = (int) (Math.random()*min + Math.random()*max);
System.out.println("Случайное число:"+randNum);
if(randNum>=25 && randNum<=250){
System.out.println("Число " + randNum+ " содержится в интервале (25,250)");
 }else { System.out.println("Число " + randNum+ " не содержится в интервале (25,250)");
 }
//ЗАДАНИЕ 6


}
    }

