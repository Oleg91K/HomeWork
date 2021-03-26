package homework3;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
//ЗАДАНИЕ 1
        int[] num = {15, 64, 81, 99, 53, 7};//99-3,-7=5
        int Element = num[5];
        num[5] = num[3];
        num[3] = Element;
        System.out.println(Arrays.toString(num));
//ЗАДАНИЕ 2
        int[] oneMass = {76, 83, 91, 69, 44, 55, 2, 17, 8, 53};
        int N = 2;
        int[][] twoMass = new int[N][];
        Arrays.sort(oneMass);
        for (int i = 0; i < N; i++)
        twoMass[i] = Arrays.copyOfRange(oneMass, i * oneMass.length / N, (i + 1) * oneMass.length / N);
        System.out.println(Arrays.deepToString(twoMass));
//ЗАДАНИЕ 3
        int[] Mass = {-6, 10, 56, -44, 2, -9};
        Mass = new int[]{-6, -44, -9};
        int[] CopyArr = new int[3];
        System.arraycopy(Mass, 0, CopyArr, 0, 3);
        Arrays.sort(CopyArr);
        System.out.println(Arrays.toString(CopyArr));
//ЗАДАНИЕ 4
        int[] newMass = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        for (int i = newMass.length - 1; i >= 0; i--);
        System.out.println(newMass);
//ЗАДАНИЕ 5
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







