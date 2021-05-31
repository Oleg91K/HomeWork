package homework3;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {

//ЗАДАНИЕ 1
        /*
       1. Создать одномерный массив типа int на 20 элементов.
       Заполнить его рандомными значениями от 3 до 500.
       Поменять местами минимальный и максимальный элементы.
         */
        int[] num = {15, 64, 81, 99, 53, 7};//99-3,-7=5
        int Element = num[5];
        num[5] = num[3];
        num[3] = Element;
        System.out.println(Arrays.toString(num));
//ЗАДАНИЕ 2
        /*
        Создать одномерный массив типа int на 20 элементов.
         Заполнить его рандомными значениями от 3 до 500.
         Поменять местами минимальный и максимальный элементы .
         */
        int[]mass= new int[20];
        for (int i = 0; i < mass.length; i++) {
            mass[i]=(int)(3+Math.random()*497);
            System.out.println(Arrays.toString(mass));
        }
 //ЗАДАНИЕ 3
 /*
 Дан массив целых чисел [78, 32, 76, 100, 0, 6301, 331, 77, 24, 2, 90] .
 Образуйте из него два отсортированных по возрастанию, данные четные и нечетные числа.
  */
        int[] srcArray3 = {-321, 894, -45, 782, -29, 12, -88};
        int minus = 0;
        for (int element : srcArray3) {
            if (element < 0) {
                ++minus;
            }
        }
        int[] minusArray = new int[minus];
        minus = 0;
        for (int element : srcArray3) {
            if (element < 0) {
                minusArray[minus] = element;
                ++minus;
            }
        }
        System.out.println("Исходный массив " + Arrays.toString(srcArray3));
        System.out.println("Отрицательный массив " + Arrays.toString(minusArray));
//ЗАДАНИЕ 4
        /*
         4. Создать массив из чётных чисел [2, 4, 6, 8, 10, 12 ... 18, 20]
         и вывести элементы массива в консоль в обратном порядке (20 18 16 ... 4 2)
         */
        int[] newMass = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        for (int i = newMass.length - 1; i >= 0; i--);
        System.out.println(newMass);
//ЗАДАНИЕ 5
        /*
         Создать массив из 11 случайных целых чисел из отрезка [-1;1], вывести массив в консоль.
 Определить какой элемент встречается в массиве чаще всего и вывести информацию об этом в консоль.
         */
        int am=0, a0=0, a1=0;
        int[] Mas = new int[11];
        for(int i=0; i<Mas.length; i++){
        Mas[i]=(int)(Math.random()*3)-1;
        System.out.print(Mas[i]+" ");
        if(Mas[i]< 0)am++;
        if(Mas[i]==0)a0++;
        if(Mas[i]>0)a1++;
        if(i==Mas.length-1){
        if(am>a0&am>a1)
        System.out.println("Чаще всего встречается -1");
        if(a0>am&a0>a1)
        System.out.println("Чаще всего встречается 0");
        if(a1>am&a1>a0)
        System.out.println("Чаще всего встречается 1");
            }
        }

    }
}







